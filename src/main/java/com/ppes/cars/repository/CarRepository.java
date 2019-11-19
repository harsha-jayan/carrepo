package com.ppes.cars.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ppes.cars.model.Car;

public interface CarRepository extends MongoRepository<Car, String> {

}
