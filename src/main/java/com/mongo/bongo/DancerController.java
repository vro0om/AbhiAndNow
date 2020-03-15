package com.mongo.bongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mongo.bongo.dancer.Dancer;
import com.mongo.bongo.dancer.DancerService;

@Controller
public class DancerController {
	
	@Autowired
	DancerService service;
	
	public DancerController() {
		
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value = "/getdancers")
	public List<Dancer> getAllDancers()
	{
		return service.getAllDancers();
	}
	
	@RequestMapping(method=RequestMethod.GET,value = "/dancer")
	public List<Dancer> getAllDancer(@RequestParam("name")String name)
	{
		return service.getDancer(name);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value = "/dancer")
	public Dancer addDancer(@RequestParam Dancer dancer)
	{
		System.out.println(dancer);
		return service.registerDancer(dancer);
	}
	
}
