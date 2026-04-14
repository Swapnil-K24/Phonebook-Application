package com.barasingha.task;

public class Contact {
	private int id;
	private String name;
	private long mobileNumber;
	
	public Contact() {
		super();
	}
	public Contact(int id, String name, long mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
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
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + "]";
	}
}
