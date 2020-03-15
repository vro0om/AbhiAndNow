package com.mongo.bongo.dancer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface DancerRepository extends CrudRepository<Dancer,Integer>{

	List<Dancer> findByName(String name);
//	List<Dancer> findByDanceStyle(String danceStyle);


}
