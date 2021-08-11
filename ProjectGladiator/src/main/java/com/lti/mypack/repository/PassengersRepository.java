package com.lti.mypack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.mypack.model.Passenger;
@Repository
public interface PassengersRepository extends JpaRepository<Passenger, Integer> {
	
	

}