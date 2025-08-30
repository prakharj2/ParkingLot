package com.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.parking.constants.ParkingConstants;
import com.parking.requestprocessor.RequestProcessor;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class StatusContoller {
	
	@Autowired
	private RequestProcessor requestProcessor;
	
	@GetMapping(value = "/parking/carno/{carno}", produces = ParkingConstants.APPLICATION_JSON, consumes = ParkingConstants.APPLICATION_JSON)
	public String createParking(@PathVariable String carno) {
	   
		return requestProcessor.requestProcessorStatus(carno);
		
	}
}
