package com.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parking.constants.ParkingConstants;
import com.parking.dto.AvailableParking;
import com.parking.requestprocessor.RequestProcessor;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@NoArgsConstructor
@AllArgsConstructor
public class AvailableController {
    
	@Autowired
	private RequestProcessor processor;
	
	@GetMapping(value= "/available", produces = ParkingConstants.APPLICATION_JSON, consumes = ParkingConstants.APPLICATION_JSON)
	public AvailableParking availableStatus() {
		return  processor.requestAvailablity();
	}
}
