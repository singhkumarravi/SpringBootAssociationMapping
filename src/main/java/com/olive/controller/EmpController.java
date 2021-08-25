package com.olive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.olive.service.EmpService;

@Component
public class EmpController {
	@Autowired
	private EmpService service;
	
	public void getRecord() {
		service.saveEmp();
	    System.out.println("Welcome to Controller....");	
	}

}
