package com.example.demo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hellos")
public class HelloResource {

	@RequestMapping(method=RequestMethod.GET)
	public String hello() {
		return "Hello from REST!";
	}
}
