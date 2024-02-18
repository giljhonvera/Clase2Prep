package com.ces2.Clas2Prep.model;


public class JamesBondCar extends Car {
	
	private Integer currentSubmergeDepth;
	private boolean isGunOnBoard = false;
	private final String MANUFACTURER = "SmartVision";
	
	public JamesBondCar(String color, 
			Integer numberOfDoors, 
			Integer currentSubmergeDepth, 
			boolean isGunOnBoard,
			String mANUFACTURER) {
		super(color, numberOfDoors);
		this.currentSubmergeDepth = currentSubmergeDepth;
		this.isGunOnBoard = isGunOnBoard;
	}
	public String submerge() {
		currentSubmergeDepth = 50;
		return "Sumergiendose "+this.currentSubmergeDepth+" metros.";
	}
	public String surface() {
		return "Saliendo a la superficie";
	}
	public Integer getCurrentSubmergeDepth() {
		return currentSubmergeDepth;
	}
	public void setCurrentSubmergeDepth(Integer currentSubmergeDepth) {
		this.currentSubmergeDepth = currentSubmergeDepth;
	}
	public boolean isGunOnBoard() {
		return isGunOnBoard;
	}
	public void setGunOnBoard(boolean isGunOnBoard) {
		this.isGunOnBoard = isGunOnBoard;
	}
	public String getMANUFACTURER() {
		return MANUFACTURER;
	}
}
