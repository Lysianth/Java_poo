package com.webforce3.poo1;

public class Parking {
	private String name;
	private String address;
	private String phoneNumber;
	private int floor[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public Parking(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int[] getFloor() {
		return floor;
	}


	
}
