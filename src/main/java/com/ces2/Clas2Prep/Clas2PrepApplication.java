package com.ces2.Clas2Prep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ces2.Clas2Prep.model.JamesBondCar;
import com.ces2.Clas2Prep.repository.CarRepository;

@SpringBootApplication
public class Clas2PrepApplication {

	public static void main(String[] args) {
		SpringApplication.run(Clas2PrepApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(CarRepository repository) {
		return args -> {
			JamesBondCar car1 = new JamesBondCar(
					"Blue",
					2,
					100,
					true,
					"XSpace"
					);
			repository.save(car1);
			
			JamesBondCar car2 = new JamesBondCar(
					"Gold",
					6,
					30,
					false,
					"XSpace"
					);
			repository.save(car2);
		};
	}
}
