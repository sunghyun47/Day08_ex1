package com.google.car;

public class Car {

	Engine engine;
	Wheel [] wheels; // 바퀴는 4개
	String color;
	
	public void info(String color) {
		System.out.println(color);
		System.out.println(this.color); //자기자신을 참조하는 this 변수
		info2(); //참조변수 this는 생략가능
		
	}
	
	public void info2() {
		System.out.println("car~~~~~~~~~~~~~~~~");
	}
	
	
	
	
}
