package com.dgoing.www;

class Car {
	String color;
	String manufacturer;
	int maxSpeed;
	void drive() {
		System.out.println("�ڵ��� : "+color+"��, "+manufacturer+"������, "+maxSpeed+" �ְ�ӷ��� �ڵ����� �����մϴ�." );
	}
}
class Bike {
	String manufacturer;
	String function;
	
	void ride() {
		System.out.println("������ : "+manufacturer+"������, "+function+" ����� �����Ÿ� �����մϴ�." );
	}
}
class Moto {
	String color;
	String manufacturer;
	int maxSpeed;
	
	void drive() {
		System.out.println("������� : "+ color+"��, "+manufacturer+"������, "+maxSpeed+" �ְ�ӷ��� ������̸� �����մϴ�." );
	}
}

class Human { 
	Car c1 = null; // ��ü�� �־�� �Ѵٴ� ����
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
		
		b1.function = "��ǿ�";
		b1.manufacturer = "��õ��";
		
		b2.function = "���̽Ŀ�";
		b2.function = "���̾�Ʈ";
		
		Moto m = new Moto();
		m.color = "Red";
		m.manufacturer = "�븲";
		m.maxSpeed = 180;
		
		Human h1 = new Human();
		Human h2 = new Human();
		
		h1.c1 = c2;
		h1.c2 = c4;
		
		h2.b = b1;
		h2.m = m;
		
		System.out.println("ù��° ���");
		h1.print();
		System.out.println();
		System.out.println("�ι�° ���");
		h2.print();
	}

}
