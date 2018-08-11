package com.jm2008.learn.annotation.predefined.override;

public class App {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		
		vehicle.start();
		vehicle.move();
		vehicle.stop();
	}

}
