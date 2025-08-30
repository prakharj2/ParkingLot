package com.parking.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class AvailableParking {
   
	private String parkingStatus;
    private int availableSlots;
	
    public String getParkingStatus() {
		return parkingStatus;
	}
	public void setParkingStatus(String parkingStatus) {
		this.parkingStatus = parkingStatus;
	}
	public int getAvailableSlots() {
		return availableSlots;
	}
	public void setAvailableSlots(int availableSlots) {
		this.availableSlots = availableSlots;
	}
    
}
