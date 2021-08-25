package com.olive.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

import com.olive.repo.EmpRep;
import com.olive.service.EmpService;
@Component
public class EmpServiceImpl implements EmpService {
 @Autowired
  private EmpRep repo;
	
	public void saveEmp() {
		repo.save();
		System.out.println("Welcome to Service Empl");
		
	}

}
