package com.mongo.bongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.bongo.dancer.Dancer;
import com.mongo.bongo.dancer.DancerService;


//@RequestBody
//
@RestController
public class DancerController {
	
	@Autowired
	DancerService service;
	
	public DancerController() {
		
		
	}
	
	@RequestMapping(method=RequestMethod.GET,value = "/getdancers")
	public List<Dancer> getAllDancers()
	{
//		List <Dancer> d = new ArrayList<Dancer>();
//		d.add(new Dancer(1,"pp",12));
//		d.add(new Dancer(2,"pp",12));
//		d.add(new Dancer(3,"pp",12));
//		return d;
		return service.getAllDancers();
	}
	
	@RequestMapping(method=RequestMethod.GET,value = "/getdancer")
	public List<Dancer> getAllDancer(@RequestParam("name")String name)
	{
		return service.getDancer(name);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value = "/putdancerd")
	public Dancer addDancer(@RequestBody Dancer dancer)
	{
//		System.out.println(id+name+age);
		return service.registerDancer(dancer);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value = "/putdancer")
	public Dancer addDancer(@RequestParam int id,@RequestParam String name, @RequestParam int age)
	{
		System.err.println(id+name+age);
		return service.registerDancer(new Dancer(id,name,age));
	}
	
}
