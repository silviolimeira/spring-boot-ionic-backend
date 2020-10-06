package com.example.demo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/weathers")
public class WeatherService {

//	@RequestMapping(value="/{q}", method=RequestMethod.GET)
//	public String hello(@PathVariable String q) {
//		
//		System.out.println("q: " + q);
//		//System.out.println("params: " + params);
//		return "Hello from REST weathers!";
//	}
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public String hello(@RequestParam(required = false) String q) {
		
		System.out.println("params: " + q);
		return "Hello from REST weathers!";
	}

	
}
