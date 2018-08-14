package oop;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Toyota();
		car.start();
		car.stop();
		car.wheel();
		
		FlayingCar car2 = new Toyota();
		car2.flyingfeature();

	}
	

}
