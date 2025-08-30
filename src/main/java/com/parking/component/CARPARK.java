package com.parking.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.parking.component.parkinginterface.BeanProcessor;
import com.parking.dto.Car;
import com.parking.service.ParkingService;

@Component
public class CARPARK implements BeanProcessor {

	@Autowired
	private ParkingService parkingService;

	@Override
	public Car processRequest(Car car, String status) {
		System.out.println("Inside car park");
		car.setStatus(status);
		return parkingService.save(car);
	}
}
