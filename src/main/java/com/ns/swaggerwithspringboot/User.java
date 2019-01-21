package com.ns.swaggerwithspringboot;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {	
	private int id;	
	@NotBlank
	@Size(min = 2, max = 10)    
	private String firstName;
	
	@NotBlank
	private String lastName;	
	private String middleName;
	@NotNull
	@Min(2)
	@Max(100)	
	private Integer age;

}
