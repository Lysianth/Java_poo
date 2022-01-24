package com.webforce3.poo1;

public class Car {
	private String brand;
	private double initialPrice;
	private int manufacturingYear;
	private String registrationNumber;
	
	public Car (String brand, double initialPrice,  int manufacturingYear,String registrationNumber) {
		this.brand = brand;
		this.initialPrice = initialPrice;
		this.manufacturingYear = manufacturingYear;
		this.registrationNumber = registrationNumber;
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
	
	public static void Hello  () {
		System.out.println("Hello");
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car ( "Renault",2000,1998,"Rg54KLM");
		Car car2 = new Car ( "Peugeot",7000,2008,"BJLOP890");
		Car car3 = new Car ( "Citroën",5500,2013,"VH678NJLwx");
		
		Car.Hello();
		System.out.println(car1.brand + " " + car1.initialPrice +" " + car1.manufacturingYear +" "+ car1.registrationNumber );
		
		
	}

}
