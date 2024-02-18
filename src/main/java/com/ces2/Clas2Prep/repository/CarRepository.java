package com.ces2.Clas2Prep.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ces2.Clas2Prep.model.JamesBondCar;

@Repository
public class CarRepository {
	private final List<JamesBondCar> carList = new ArrayList<>();
	
	public List<JamesBondCar> findAll(){
		return carList;
	}
	public void save(JamesBondCar car) {
		carList.add(car);
	}
}
