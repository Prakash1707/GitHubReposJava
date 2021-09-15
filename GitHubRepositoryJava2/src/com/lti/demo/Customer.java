package com.lti.demo;

public class Customer {
	private int id;
	private String name;
	private int bill;
	public Customer(int id, String name, int bill) {
		super();
		this.id = id;
		this.name = name;
		this.bill = bill;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", bill=" + bill + "]";
	}
	
}
