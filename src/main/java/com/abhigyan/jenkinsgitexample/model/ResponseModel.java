package com.abhigyan.jenkinsgitexample.model;

import java.time.LocalDateTime;
import java.util.Random;

public class ResponseModel {

	private LocalDateTime date;
	private Integer number;

	public ResponseModel() {
		this.date = LocalDateTime.now();
		this.number = new Random().nextInt(1000);
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
