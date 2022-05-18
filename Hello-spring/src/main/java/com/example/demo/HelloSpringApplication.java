package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
		
		System.out.println("Hello World");	}

}
@RestController 
public class SecondController { 
	@RequestMapping(value = "/hellospring", method = RequestMethod.GET) 
	public String helloSpring() { 
		return "Hello Spring"; 
		} 
}

