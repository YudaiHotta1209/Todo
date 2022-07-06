package com.example.demo.model;



import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Todo {

	private Long id;

	@NotBlank
	private String task;


}