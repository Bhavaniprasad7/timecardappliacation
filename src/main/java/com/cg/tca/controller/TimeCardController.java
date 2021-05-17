package com.cg.tca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tca.entities.TimeCard;
import com.cg.tca.exception.ResourceNotFoundException;
import com.cg.tca.service.TimeCardService;

@RestController 
@RequestMapping("/api/v2/timecard")
public class TimeCardController {

	@Autowired
	private TimeCardService tcs;
	
	@GetMapping("/getTimeCard/{id}")
	public TimeCard getTimeCardById(@PathVariable(value = "id") Integer tcId){
		return tcs.getTimeCard(tcId);
	}
	
	
	@PutMapping("/timeCardEdit/{tc_id}")
	public Integer editTimeCard(@PathVariable("tc_id") Integer id,@RequestBody TimeCard tcard) throws ResourceNotFoundException{
		
		return tcs.updateEntries(id, tcard);
	}
	
	
	
	@DeleteMapping("/timecardDelete/{id}")
	public Boolean deleteTimeCard(@PathVariable("id") Integer id ) throws ResourceNotFoundException{
		return tcs.removeEntry(id);
	}
	
	
	@GetMapping("/timecards")
	public List<TimeCard> getAllEntries(){
		List<TimeCard> timecard = tcs.displayAll();
		return timecard;
	}
	
}

