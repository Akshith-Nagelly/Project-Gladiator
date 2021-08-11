package com.lti.mypack.service;

import java.util.List;

import com.lti.mypack.model.Passenger;

public interface PassengersService {
	
	public List<Passenger> getAllPassengers();
	public boolean addPassenger(Passenger passenger);

}
