package com.microservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.common.WebServiceResponse;

@RestController
@RequestMapping("/api")
public class ApplicationConfiguration {

	@RequestMapping("/hello")
	public @ResponseBody WebServiceResponse hello(@RequestParam("name") String name) {
		WebServiceResponse res = new WebServiceResponse();
		if(!name.equalsIgnoreCase("")) {
			res.setReturnObj(name);
			res.setSucess(true);
			System.out.println("name : "+name);
		}else {
			res.setReturnObj("Please Enter Anything..!");
			res.setSucess(false);
			System.out.println("name : "+name);
		}
		return res;
	}
}
