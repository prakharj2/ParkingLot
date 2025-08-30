package com.parking.validator;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.parking.exception.service.InvalidEndpointRequestException;

@Component
public class StatusValidator {

	@Value("#{'${com.parking.status}'.split(',')}")
	private List<String> validList;
	
	public void statusCheck(String status) {
		
		boolean statusCheck = false;
		long number = validList.stream().filter(s -> s.equals(status)).collect(Collectors.counting());
		
        if(number != 0) {
        	statusCheck= true;
        }
        
        if (!statusCheck) {
        	throw new InvalidEndpointRequestException("Invalid status");
		}
	}
}
