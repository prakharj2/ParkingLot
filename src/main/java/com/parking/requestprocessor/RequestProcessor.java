package com.parking.requestprocessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.parking.component.AvailableSlots;
import com.parking.component.STATUS;
import com.parking.component.parkinginterface.BeanProcessor;
import com.parking.constants.ParkingConstants;
import com.parking.dto.AvailableParking;
import com.parking.dto.Car;
import com.parking.validator.StatusValidator;

@Component
public class RequestProcessor {

	@Autowired
	private StatusValidator statusValidator;
	@Autowired
	private ApplicationContext applicationContext;
	@Autowired
	private STATUS carStatus;
    @Autowired
    private AvailableSlots availableSlots;
    
 	public Car requestProcessor(Car car, String status) {
		statusValidator.statusCheck(status);
		BeanProcessor beanProcessor = applicationContext.getBean(ParkingConstants.CAR + status.toUpperCase(), BeanProcessor.class);
		beanProcessor.processRequest(car, status);
		return car;
	}
	
	public String requestProcessorStatus(String carno) {		
		String status = carStatus.status(carno);
		return status;
	}
	

	public AvailableParking requestAvailablity() {
	    return availableSlots.checkSlots();
	}

}
