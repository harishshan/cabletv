package com.blogspot.harishshan.cabletv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("common")
public class CommonController {
	
	@RequestMapping("/hello")
	public @ResponseBody String helloWorld() {
		return "Harish";
	}
}
