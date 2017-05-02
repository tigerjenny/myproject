package oo.test;

import java.util.ArrayList;

import oo.abstraction.Car;  //Car 也可以用*代替  改成*會去收尋整個資料夾
import oo.statics.Student;	//呼叫別的package裡的方法時，記得加入此行

public class Tester {

	public static void main(String[] args) {
		Car c = new Car(2000,"bb","xx"); 
		ArrayList<String> a = new ArrayList(); //加入<String>限定只能輸入字串型態資料
		//String[] numbers = {"881","845","235","802"}
		a.add("881");
		a.add("845");
		//a.add(123);
		a.add("235");
		//a.add(true);
		System.out.println(a.size());
		a.add("802");
		System.out.println(a.size());
		a.set(2, "299");
		System.out.println(a);
		//String data =(String)a.get(0);
		String data =a.get(0);
		//int n =(int)a.get(4);
		Student stu = new Student();
	}

}
