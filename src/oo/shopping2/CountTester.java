package oo.shopping2;

import java.util.ArrayList;

public class CountTester {

	public static void main(String[] args) {
		System.out.println("原價"+"\t"+"折扣後"+"\t"+"還原金");
		ArrayList<Customer> list = new ArrayList(); 
			list.add(new Customer(6000));
			list.add(new SilverCustomer(8000));
			list.add(new GoldenCustomer(10000));
			list.add(new GoldenCustomer(15000));
			list.add(new SilverCustomer(1000));
			list.add(new Customer(6000));
		for(int i=0;i<list.size();i++){
			Customer cus = list.get(i);
			cus.print();
		}

	
	}
	
}
