package com.example.SecondController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class SecondController { 
	@RequestMapping(value = "/hellospring", method = RequestMethod.GET) 
	public String helloSpring() { 
		return "Hello Spring"; 
		} 
}