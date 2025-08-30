package com.parking.component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.parking.constants.ParkingConstants;
import com.parking.dto.AvailableParking;
import com.parking.dto.Car;
import com.parking.service.ParkingService;

@Component
public class AvailableSlots {
	
	@Autowired
	private ParkingService parkingService;

	@Value("${com.parking.spots}")
	private int availableSpots;

	public AvailableParking checkSlots() {
		AvailableParking availableParking = new AvailableParking();
		List<Car> carList = new ArrayList<Car>();
		carList = parkingService.findAll();
		int count = 0;
		for(int i = 0; i< carList.size(); i++) {
			count++;
		}
		if(count >  availableSpots) {
			availableParking.setParkingStatus(ParkingConstants.NO);
			availableParking.setAvailableSlots(0);
		}else {
			availableParking.setParkingStatus(ParkingConstants.YES);
			availableParking.setAvailableSlots(availableSpots-count);
		}
		
		return availableParking;
	}
}
