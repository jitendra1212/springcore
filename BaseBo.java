package com.nt.bo;

import java.util.Date;

import lombok.Data;

@Data
public abstract class BaseBo {
	private int id;
	private String name;
	private Date doj;

	public BaseBo() {
		System.out.println("Basbo:o parsem constructor");
	}
}
