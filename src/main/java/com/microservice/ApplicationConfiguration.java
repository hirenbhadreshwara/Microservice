package com.microservice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.common.WebServiceResponse;
import com.dto.AppDto;

@RestController
@RequestMapping("/api")
public class ApplicationConfiguration {
	
	@RequestMapping(value = "hello", method = RequestMethod.POST)
	public @ResponseBody WebServiceResponse savePassport(
			HttpServletRequest req,
			@Valid AppDto appDto, BindingResult result,
			HttpServletResponse response) {

		WebServiceResponse res = new WebServiceResponse();
		try {
			if (!result.hasErrors()) {
				if (!appDto.getName().equalsIgnoreCase("")) {
					res.setReturnObj(appDto.getName());
					res.setSucess(true);
					System.out.println("name : " + appDto.getName());
				} else {
					res.setReturnObj("Please Enter Anything..!");
					res.setSucess(false);
					System.out.println("name : " + appDto.getName());
				}

			} else {
				String errorMessage = "";
				List<ObjectError> errors = result.getAllErrors();
				for (ObjectError objectError : errors) {
					errorMessage = errorMessage + objectError.getDefaultMessage();
				}
				res.setSucess(false);
				res.setHasError(true);
				res.setReturnMessage(errorMessage);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return res;
	}
}
