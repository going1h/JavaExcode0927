package com.dgoing.www;


// Test5 public(������) ��� ������ ����ϴ°� public(����������) class(Ŭ����)
/*
 * ������ ������ ����, �Ķ�, ��Ȳ, �뷢 ���� ������ �ֽ��ϴ�.
 * ���� ����� �ֽ��ϴ�.(���� ����� ������ ���ʷ� �����ϴ�.)
 */

class Philtong
{
	//has����
	Pencil red; // ��üȭ -> ��ü
	Pencil yellow; // ��üȭ -> ��ü

	
	Philtong(Pencil red, Pencil yellow) {
		this.red = red;
		this.yellow = yellow;
	}
	
	void print()
	{
		red.write();
		yellow.write();
	}
	

}


class Pencil
{
	String color;
	
	void write()
	{
		System.out.println("���� ����� "+color+" ���ʷ� �����ϴ�.");
	}
}


public class Test5 {

	//main�Լ� : public(����) static(������)
	//static ���� �Լ��� ���� �ٷ� �޸𸮿� �ö󰩴ϴ�.
	//�ٷ� ��밡���մϴ�.
	//�⺻�� ��ü�� �Ǿ��� ��簡���մϴ�. static
	//main Ư���� �Լ��̱⶧���� ���α׷��� ����Ǹ� ���� ���� �����մϴ�.
	//���� ����Ҷ� java -version
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pencil() ������
		//Pencil
		//�����ڸ� ������ ������ default�����ڰ� �ڵ����� ���Ե˴ϴ�.
		//Ŭ������()
		Pencil red = new Pencil(); // ��üȭ -> ��ü
		Pencil blue = new Pencil(); // ��üȭ -> ��ü
		Pencil orange = new Pencil(); // ��üȭ -> ��ü
		Pencil yellow = new Pencil(); // ��üȭ -> ��ü
		
		
		
		red.color = "������";
		blue.color = "�Ķ���";
		orange.color = "��Ȳ��";
		yellow.color = "�����";
		
		Philtong p = new Philtong(red, yellow);
		p.print();
		
		
//		red.write();
//		blue.write();
//		orange.write();
//		yellow.write();
		
		
	}

}
