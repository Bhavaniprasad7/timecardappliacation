package com.cg.tca.service;


import java.util.List;

import com.cg.tca.entities.TimeCard;
import com.cg.tca.exception.ResourceNotFoundException;



public interface TimeCardService {

	TimeCard saveTimeEntry(TimeCard man);

	boolean removeEntry(int timeCardId) throws ResourceNotFoundException;

	int updateEntries(int id,TimeCard tcard) throws ResourceNotFoundException;

	List<TimeCard> displayEntries(int employeeId);

	List<TimeCard> displayAll();

	TimeCard getTimeCard(Integer tcId);
	
}