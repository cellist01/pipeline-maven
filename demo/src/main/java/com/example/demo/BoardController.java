package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	@GetMapping("/home")
	public String homepage () {
		return "home";
		// TODO Auto-generated method stub

	}

}
