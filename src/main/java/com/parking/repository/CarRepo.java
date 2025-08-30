package com.parking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.dto.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, String>{
	
	
	
}
