package oo.abstraction;

public class Main {

	public static void main(String[] args) {
		 Car c = new Car(2000,"bb","xx");
		 c.setMileage(25000);
		 float current = c.addMilage(80);
		 System.out.println("目前里程為："+ current);
		 
		 
	}

}
