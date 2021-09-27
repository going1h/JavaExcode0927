package com.dgoing.www;


// Test5 public(공용의) 어느 누구나 사용하는게 public(접근제한자) class(클래스)
/*
 * 연필은 각각의 빨강, 파란, 주황, 노랙 색을 가지고 있습니다.
 * 쓰는 기능이 있습니다.(쓰는 기능은 빨간색 연필로 적습니다.)
 */

class Philtong
{
	//has관계
	Pencil red; // 객체화 -> 객체
	Pencil yellow; // 객체화 -> 객체

	
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
		System.out.println("쓰는 기능은 "+color+" 연필로 적습니다.");
	}
}


public class Test5 {

	//main함수 : public(공용) static(전역의)
	//static 붙은 함수나 변수 바로 메모리에 올라갑니다.
	//바로 사용가능합니다.
	//기본은 객체가 되야지 사양가능합니다. static
	//main 특별한 함수이기때문에 프로그램이 실행되면 제일 먼저 시작합니다.
	//실행 명령할때 java -version
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pencil() 생성자
		//Pencil
		//생성자를 만들지 않으면 default생성자가 자동으로 주입됩니다.
		//클래스명()
		Pencil red = new Pencil(); // 객체화 -> 객체
		Pencil blue = new Pencil(); // 객체화 -> 객체
		Pencil orange = new Pencil(); // 객체화 -> 객체
		Pencil yellow = new Pencil(); // 객체화 -> 객체
		
		
		
		red.color = "빨간색";
		blue.color = "파란색";
		orange.color = "주황색";
		yellow.color = "노란색";
		
		Philtong p = new Philtong(red, yellow);
		p.print();
		
		
//		red.write();
//		blue.write();
//		orange.write();
//		yellow.write();
		
		
	}

}
