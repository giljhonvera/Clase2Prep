package com.ces2.Clas2Prep.model;

public class Car {
	
	private String color;
	private Integer numberOfDoors;
	
	public String startEngine() {
		return "Encendiendo el motor";
	}
	public String stopEngine() {
		int tempCounter=0;
		return "Apagando el motor";
	}
	public Car(String color, Integer numberOfDoors) {
		this.color = color;
		this.numberOfDoors = numberOfDoors;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(Integer numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
}


