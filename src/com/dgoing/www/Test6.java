package com.dgoing.www;

class Car {
	String color;
	String manufacturer;
	int maxSpeed;
	void drive() {
		System.out.println("자동차 : "+color+"색, "+manufacturer+"제조사, "+maxSpeed+" 최고속력인 자동차를 운전합니다." );
	}
}
class Bike {
	String manufacturer;
	String function;
	
	void ride() {
		System.out.println("자전거 : "+manufacturer+"제조사, "+function+" 기능인 자전거를 운전합니다." );
	}
}
class Moto {
	String color;
	String manufacturer;
	int maxSpeed;
	
	void drive() {
		System.out.println("오토바이 : "+ color+"색, "+manufacturer+"제조사, "+maxSpeed+" 최고속력인 오토바이를 운전합니다." );
	}
}

class Human { 
	Car c1 = null; // 객체를 넣어야 한다는 개념
	Car c2 = null;
	Bike b = null;
	Moto m = null;
	
	void print() {
		if(c1 != null) {
			c1.drive();
		}
		if(c2 != null) {
			c2.drive();
		}
		if(b != null) {
			b.ride();
		}
		if(b != null) {
			m.drive();
		}
	}
}
public class Test6 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car();
		
		c1.color = "Silver";
		c1.manufacturer = "Ford";
		c1.maxSpeed = 220;
		
		c2.color = "black";
		c2.manufacturer = "BMW";
		c2.maxSpeed = 240;
		
		c3.color = "white";
		c3.manufacturer = "Samsung";
		c3.maxSpeed = 200;
		
		c4.color = "fs";
		c4.manufacturer = "Hyundai";
		c4.maxSpeed = 180;
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		
		b1.function = "산악용";
		b1.manufacturer = "삼천리";
		
		b2.function = "접이식용";
		b2.function = "자이언트";
		
		Moto m = new Moto();
		m.color = "Red";
		m.manufacturer = "대림";
		m.maxSpeed = 180;
		
		Human h1 = new Human();
		Human h2 = new Human();
		
		h1.c1 = c2;
		h1.c2 = c4;
		
		h2.b = b1;
		h2.m = m;
		
		System.out.println("첫번째 사람");
		h1.print();
		System.out.println();
		System.out.println("두번째 사람");
		h2.print();
	}

}
