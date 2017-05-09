package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		Car car1 = new Car(1800, "Altis", "Toyota");
		Car car2 = new Car(2000, "Accord", "Honda");
		Car car3 = new Car(2000, "Wish", "Toyota");
		Car car4 = new Car("aaa", "bbb");

		int[] n = new int[5];
		System.out.println(n[2]);

		// Car[] cars = {car1,car2,car3};
		Car[] cars = new Car[3];
		cars[0] = new Car(1800, "Altis", "Toyota");
		cars[1] = new Car(2000, "Accord", "Honda");
		cars[2] = new Car(2000, "Wish", "Toyota");

		cars[0].id = 300;
		cars[1].id = 400;
		cars[2].id = 403;
		System.out.println(cars[1].cc);
		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.println(cars[i].name);
		}
		System.out.println(i);
		class ABC {

		}
		ABC abc = new ABC();
		
		Truck tru = new Truck(4000, "haha", "yamaha", 8, 8000);
		tru.setMileage(2000);
		tru.addMilage(80);
		System.out.println(tru.milage);
		
		Truck tru1 = new Truck(5000, "soso", "Apple", 8, 7500);
		tru1.setMileage(2500);
		tru1.addMilage(50);
		System.out.println(tru1.milage);
	}

}
