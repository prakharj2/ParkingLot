package com.parking.component.parkinginterface;

import com.parking.dto.Car;

public interface BeanProcessor {
	
	public Car processRequest(Car car, String status);
	
}
