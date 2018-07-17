package com.dto;

import org.hibernate.validator.constraints.NotBlank;

public class AppDto {
	 @NotBlank(message = "username can't empty!")
	    String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AppDto [name=" + name + "]";
	}
	 
	 
}
