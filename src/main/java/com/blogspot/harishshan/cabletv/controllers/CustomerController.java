package com.blogspot.harishshan.cabletv.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@RequestMapping("/hello")
	public @ResponseBody String helloWorld() {
		return "Harish";
	}
}
