package com.google.mobile;

public class MobileMain {

	public static void main(String[] args) {

		PhoneView pv = new PhoneView();
		
		Phone phone = new Phone(); // new phone 생성자 호출
		Phone phone2 = new Phone();
		
		pv.view(phone);
		
		
		
		
	}

}
