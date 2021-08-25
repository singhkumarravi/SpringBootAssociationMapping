package com.olive.repo.impl;

import org.springframework.stereotype.Component;

import com.olive.repo.EmpRep;
@Component
public class EmpRepositiory implements EmpRep{

	
	public void save() {
		System.out.println("Welcome To Repositiory....");
		
	}
	

}
