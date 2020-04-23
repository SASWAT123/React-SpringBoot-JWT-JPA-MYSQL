package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class MainController {
	
	//Protected API
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String firstPage() {
		return "Congratulations you are authenticated";
	}

}
