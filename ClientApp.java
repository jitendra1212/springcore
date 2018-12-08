package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.Service;

public class ClientApp {
public static void main(String[] args) {
	ApplicationContext ctx=null;
	Service service=null;
	ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	service=ctx.getBean("service",Service.class);
	service.registrationStudent(101,"jitendra","corejava");
	service.registrationEmployee(102,"raga","developer");
	
}
}
