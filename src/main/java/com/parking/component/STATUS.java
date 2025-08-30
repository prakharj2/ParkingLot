package com.parking.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.parking.dto.Car;
import com.parking.service.ParkingService;

@Component
public class STATUS {
	
	@Autowired
	private ParkingService parkingService;
	
	public String status(String carno) {
		Car car = parkingService.getById(carno);
		String status = car.getStatus();
		return status;
	}

}
