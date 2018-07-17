package com.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.common.WebServiceResponse;

@RestController
@RequestMapping("/api")
public class ApplicationConfiguration {

	@RequestMapping("/hello")
	public WebServiceResponse hello(@RequestParam("name") String name) {
		WebServiceResponse res = new WebServiceResponse();
		res.setReturnObj(name);
		res.setSucess(true);
		System.out.println("name : "+name);
		return res;
	}
}
