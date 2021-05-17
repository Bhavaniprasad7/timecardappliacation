package com.cg.tca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.tca.entities.TimeCard;

public interface TimeCardRepository extends JpaRepository<TimeCard, Integer>{

}
