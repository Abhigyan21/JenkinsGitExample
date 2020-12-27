package com.abhigyan.jenkinsgitexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhigyan.jenkinsgitexample.model.ResponseModel;

@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping
	public ResponseModel getData() {
		return new ResponseModel();
	}
}
