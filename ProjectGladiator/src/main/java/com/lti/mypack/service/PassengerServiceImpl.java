package com.lti.mypack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mypack.model.Passenger;
import com.lti.mypack.repository.PassengersRepository;

@Service
@Transactional
public class PassengerServiceImpl implements PassengersService {
	@Autowired
	PassengersRepository paRepo;

	@Override
	public List<Passenger> getAllPassengers() {
		
		return paRepo.findAll();
	}

	@Override
	public boolean addPassenger(Passenger passenger) {
		paRepo.save(passenger);
		return true;
	}

}
