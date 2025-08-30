package com.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parking.constants.ParkingConstants;
import com.parking.dto.Car;
import com.parking.requestprocessor.RequestProcessor;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class ParkingController {

	@Autowired
	private RequestProcessor requestProcessor;

	@PostMapping(value = "/parking/{status}", produces = ParkingConstants.APPLICATION_JSON, consumes = ParkingConstants.APPLICATION_JSON)
	public Car createParking(@PathVariable String status, @RequestBody Car car) {
		System.out.println("Inside park controller");
		return requestProcessor.requestProcessor(car, status);
	}
}
