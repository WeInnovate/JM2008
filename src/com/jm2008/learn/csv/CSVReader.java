package com.jm2008.learn.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.toMap;

public class CSVReader {

	public static void main(String[] args) {

		String csvFile = "csv/matches.csv";
		String line = "";
		String cvsSplitBy = ",";

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			boolean firstRow = true;
			List<Match> matches = new ArrayList<>();
			while ((line = br.readLine()) != null) {

				if (firstRow) {
					firstRow = false;
					continue;
				}

				// use comma as separator
				String[] csvRow = line.split(cvsSplitBy);

				Match match = new Match();
				match.setMatchId(Long.valueOf(csvRow[0]));
				match.setSeason(Integer.valueOf(csvRow[1]));
				match.setCity(csvRow[2]);
				match.setTeam1(csvRow[4]);
				match.setTeam2(csvRow[5]);
				match.setTossWin(csvRow[6]);
				match.setTossDecision(csvRow[7]);
				match.setResult(csvRow[8]);
				if (csvRow.length > 9) {
					match.setWinner(csvRow[9]);
				}
				matches.add(match);
			}
			System.out.println("YEAR  TEAM                  COUNT");
			for (Entry<String, Integer> entry : getTopTeams(matches, 4, "field", 2016).entrySet()) {
				System.out.println("2016  "+entry.getKey() + "         " + entry.getValue());
			}
			for (Entry<String, Integer> entry : getTopTeams(matches, 4, "field", 2017).entrySet()) {
				System.out.println("2017  "+entry.getKey() + "         " + entry.getValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static LinkedHashMap<String, Integer> getTopTeams(List<Match> matches, int top, String tossDecision,
			int season) {
		Map<String, List<Match>> map = matches.stream()
				.filter(match -> (match.getSeason() == season) && match.getTossDecision().equals(tossDecision))
				.collect(Collectors.toList()).stream().collect(Collectors.groupingBy(Match::getTossWin)).entrySet()
				.stream().sorted(comparingInt(e -> e.getValue().size()))
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {
					throw new AssertionError();
				}, LinkedHashMap::new));

		List<String> teams = new LinkedList<>();

		for (Entry<String, List<Match>> entry : map.entrySet()) {
			teams.add(entry.getKey());
		}
		Collections.reverse(teams);
		List<String> subTeams = teams.subList(0, top);
		LinkedHashMap<String, Integer> intendedMap = new LinkedHashMap();
		subTeams.forEach(subTeam -> intendedMap.put(subTeam, map.get(subTeam).size()));
		return intendedMap;
	}
}
