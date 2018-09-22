package com.jm2008.learn.csv;

public class Match {
	private Long matchId;
	private int season;
	private String city;
	private String team1;
	private String team2;
	private String tossWin;
	private String tossDecision;
	private String result;
	private String winner;

	public Long getMatchId() {
		return matchId;
	}

	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}

	public int getSeason() {
		return season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getTossWin() {
		return tossWin;
	}

	public void setTossWin(String tossWin) {
		this.tossWin = tossWin;
	}

	public String getTossDecision() {
		return tossDecision;
	}

	public void setTossDecision(String tossDecision) {
		this.tossDecision = tossDecision;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", season=" + season + ", city=" + city + ", team1=" + team1 + ", team2="
				+ team2 + ", tossWin=" + tossWin + ", tossDecision=" + tossDecision + ", result=" + result + ", winner="
				+ winner + "]";
	}

}
