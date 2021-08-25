package com.olive.test.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.controller.EmpController;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private EmpController cont;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("App Starting....");
	 cont.getRecord();
		
	}
	

}
