package oo.shopping2;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		System.out.println("原價"+"\t"+"折扣後"+"\t"+"還原金");
		ArrayList<Customer> list = new ArrayList(); 
			list.add(new Customer(6000));
			list.add(new SilverCustomer(8000));
			list.add(new GoldenCustomer(10000));
			list.add(new GoldenCustomer(15000));
			list.add(new SilverCustomer(1000));
			list.add(new Customer(6000));
		//for(int i=0;i<list.size();i++){         for i 迴圈
			//Customer cus = list.get(i);
		for(Customer cus : list){               //for each 迴圈   會自己將右邊的值一個一個加入左邊
			if(cus instanceof SilverCustomer && !(cus instanceof GoldenCustomer)){    //instanceof可以追溯是哪個類別的
				System.out.print("*");
				SilverCustomer silver = (SilverCustomer)cus;	//轉型 把原本customer轉回silvercustomer
			}
			cus.print();
		}
	//參考用	
	String[] array = {"aa","bb","cc"};
	for(String s : array){
		System.out.println(s);
	}
	for(int i=0;i< array.length;i++){         
		String s = array[i];
		System.out.println(s);
	}
	}
	
}
