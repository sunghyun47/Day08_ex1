package com.google.car;

public class WheelAdd {

	public Car setWheel(Car car) {
		
		Wheel [] wheels = new Wheel[4]; //바퀴 4개 공간
		for(int i=0; i<wheels.length; i++) {
			Wheel w = new Wheel();
			w.color = "black";
			w.size = 18;
			w.use = "snow";
			wheels[i] = w;
		}
		
		car.wheels = wheels;
		return car;
		
	}
	
	
}
