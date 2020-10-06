package com.example.demo.resources;

import java.io.IOException;

import org.springframework.http.ResponseEntity;

//import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Climate;
import com.example.demo.domain.Weather;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	public ResponseEntity<?> hello(@RequestParam(required = false) String q) {
		
		System.out.println("params: " + q);
		//return "Hello from REST weathers!";
		
        String jsonString = "{}";

        ObjectMapper mapper = new ObjectMapper();

        // Creating object of Organisation
        Weather weather = new Weather();
        weather.add(new Climate());

        //GenericEntity<List<Data>> genericEntity = new GenericEntity<List<Data>>(data) {};

        try {

            // Java objects to JSON string - compact-print
            //jsonString = mapper.writeValueAsString(genericEntity);
            jsonString = mapper.writeValueAsString(weather);

            // Displaying JSON String
            System.out.println(jsonString);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
		
		
		return ResponseEntity.ok().body(jsonString);	
	}

	
}
