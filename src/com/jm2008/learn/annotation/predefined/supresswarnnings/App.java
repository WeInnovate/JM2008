package com.jm2008.learn.annotation.predefined.supresswarnnings;

public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		vehicle.start();
		vehicle.move();
		vehicle.stop();
	}
}
