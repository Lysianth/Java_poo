package com.webforce3.poo1;

public class Car {
	private String brand;
	private double initialPrice;
	private int manufacturingYear;
	private String registrationNumber;
	User user;
	Parking parking;

	public Car(String brand, double initialPrice, int manufacturingYear, String registrationNumber, User user,Parking parking) {
		this.brand = brand;
		this.initialPrice = initialPrice;
		this.manufacturingYear = manufacturingYear;
		this.registrationNumber = registrationNumber;
		this.user = user;
		this.parking = parking;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getInitialPrice() {
		return initialPrice;
	}

	public void setInitialPrice(double initialPrice) {
		this.initialPrice = initialPrice;
	}

	public int getManufacturingYear() {
		return manufacturingYear;
	}

	public void setManufacturingYear(int manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public static void Hello() {
		System.out.println("Hello");
	}
	public User getUser() {
		return user;
	}

	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}


	public double estimValue() {
		double value = initialPrice;
		if (manufacturingYear >= 2010 && brand.equals("Mercedes")) {
			value = value / 2;
			return value;
		} else if (manufacturingYear <= 1980) {
			value = value / 6;
			return value;
		} else {
			value = value / 4;
			return value;
		}

	}

	public double assurance() {
		double value = initialPrice;
		double assurPrice = value * 0.02;
		return assurPrice;
	}

}
