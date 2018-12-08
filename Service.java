package com.nt.service;

import java.util.Date;

import com.nt.bo.EmployeeBo;
import com.nt.bo.StudentBo;
import com.nt.dao.RegistrationDao;

public abstract class Service {
	private RegistrationDao dao;
	public void setDao(RegistrationDao dao) {
		this.dao = dao;
	}

	public Service() {
		System.out.println("collegeservice:0-param constructor");
		
	}
	
	public abstract StudentBo createStudentBo();
	public abstract EmployeeBo createEmployeeBo();
	
	public void registrationStudent(int id,String name,String Course) {
		StudentBo stbo=null;
		stbo=createStudentBo();
		stbo.setId(id);
		stbo.setName(name);
		stbo.setCourse(Course);
		stbo.setDoj(new Date());
		dao.insertStudent(stbo);
		
	}
	public void registrationEmployee(int id,String name,String desg) {
	EmployeeBo empbo=null;
	empbo=createEmployeeBo();
	empbo.setId(id);
	empbo.setName(name);
		empbo.setDesg(desg);
		empbo.setDoj(new Date());
		dao.insertEmployee(empbo);
		
	}

}
