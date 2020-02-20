package com.lhy.bean;

public class Vo {
	
	private String name;
	
	private String day1;
	
	private String day2;

	


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getDay1() {
		return day1;
	}




	public void setDay1(String day1) {
		this.day1 = day1;
	}




	public String getDay2() {
		return day2;
	}


	public void setDay2(String day2) {
		this.day2 = day2;
	}
	public Vo(String name, String day1, String day2) {
		super();
		this.name = name;
		this.day1 = day1;
		this.day2 = day2;
	}

	@Override
	public String toString() {
		return "Vo [name=" + name + ", day1=" + day1 + ", day2=" + day2 + "]";
	}




	public Vo() {
		// TODO Auto-generated constructor stub
	}
	
	

}
