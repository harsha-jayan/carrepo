package com.ppes.cars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ppes.cars.model.Car;
import com.ppes.cars.repository.CarRepository;

@RestController
@RequestMapping(value = "/cars")
public class CarController {

	@Autowired
	private CarRepository CarRepository;
	
	@RequestMapping(value="/getCars",method=RequestMethod.GET)
	public List<Car> getCars(){
		return CarRepository.findAll();
	}

	/*
	 * @RequestMapping(value="/create",method=RequestMethod.POST)
	 */
	@PostMapping
	public String createCar(@RequestBody Car car) {

		CarRepository.save(car);
		return "success";

	}

}
