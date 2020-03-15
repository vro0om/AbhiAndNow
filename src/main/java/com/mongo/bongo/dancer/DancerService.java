package com.mongo.bongo.dancer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DancerService {
	
	@Autowired
	DancerRepository db;
	
	public Dancer registerDancer(Dancer dancer) {
		return db.save(dancer);
	}
	
	public List<Dancer> getAllDancers() {
		List<Dancer> dancerList = new ArrayList<>();
		 db.findAll().forEach(dancerList::add);
		 return dancerList;
	}
	
	public List<Dancer> getDancer(String name)
	{
		return db.findByName(name);
	}
	
}
