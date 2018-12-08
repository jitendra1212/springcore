package com.nt.dao;

import com.nt.bo.EmployeeBo;
import com.nt.bo.StudentBo;

public class RegistrationDao {
	
	public void insertStudent(StudentBo stbo) {
		System.out.println(stbo.getId()+" "+stbo.getName()+" "+stbo.getCourse()+" "+stbo.getDoj());
	}
	

	public void insertEmployee(EmployeeBo empbo) {
		System.out.println(empbo.getId()+" "+empbo.getName()+" "+empbo.getDesg()+" "+empbo.getDoj());
	}
	

}
