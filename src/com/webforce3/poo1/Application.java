package com.webforce3.poo1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Renault", 2000, 1998, "Rg54KLM", new User("efz", "qef", "qsf<", "usivu"),
				new Parking("dada", "coquelicot","089765786"));
		/*
		 * Car car2 = new Car ( "Peugeot",7000,2008,"BJLOP890"); Car car3 = new Car (
		 * "Citroën",5500,2013,"VH678NJLwx"); Car car4 = new Car
		 * ("Mercedes",13000,2011,"Gugvuv67");
		 */

		Car.Hello();
		System.out.println(car1.getBrand() + " " + car1.getInitialPrice() + " " + car1.getManufacturingYear() + " "
				+ car1.getRegistrationNumber() + " " + car1.getUser().getName()+ " "+ car1.getParking().getFloor()[2]);
		System.out.println(car1.estimValue());
		
		// System.out.println(car4.estimValue());
		// System.out.println(car2.assurance());

	}

}
