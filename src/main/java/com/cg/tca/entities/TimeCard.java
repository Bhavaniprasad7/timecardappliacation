package com.cg.tca.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="TIMECARD")
public class TimeCard {
	@Id
	@Column(name="TIME_CARDID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int timeCardId;
	@Column(name="ENTRY_DATE")
	private LocalDate date;
	@Column(name="ENTRY_TIME")
	private LocalTime timeEntry;
	@Column(name="EXIT_TIME")
	private LocalTime timeExit;
	@Column(name="STATUS")
	private String status;
}