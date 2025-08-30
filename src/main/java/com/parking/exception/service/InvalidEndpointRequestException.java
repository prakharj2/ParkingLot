package com.parking.exception.service;

public class InvalidEndpointRequestException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEndpointRequestException(String message) {
		super(message);
	}

}
