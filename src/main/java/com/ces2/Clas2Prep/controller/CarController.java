package com.ces2.Clas2Prep.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ces2.Clas2Prep.model.JamesBondCar;
import com.ces2.Clas2Prep.repository.CarRepository;

@Controller
@RequestMapping("/car")
public class CarController {
	public final CarRepository repository;
	
	public CarController(CarRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("")
	public String findAll(Model model){
		model.addAttribute("cars",repository.findAll());
		return "index";
	}
	
}
