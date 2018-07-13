package com.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationConfiguration {

	@RequestMapping("hello")
	public String hello() {
		return "hello_word asdsasd";
	}
}
