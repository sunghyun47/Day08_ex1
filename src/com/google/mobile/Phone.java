package com.google.mobile;

public class Phone {

	String brand;
	int price;
	String color;
	int size;
	
	public Phone() {
		//윗줄 코드 : 디폴트 생성자, 빈생성자, 기본생성자(셋다 같은의미)
		//매개변수가 없는 생성자
		//클래스내에 생성자가 하나라도 없으면 컴파일러가 디폴트생성자를 하나 만들어줌
		this.brand = "LG";
		this.price = 200;
		color = "RED"; //this. 생략가능
		size = 15; //this. 생략가능
		
		System.out.println("phone 제작 완료");
		this.info();
		
	}
	
	public void info() {
		System.out.println("phone~~~~~~~~~~~~~~");
	}
	
	
	
}
