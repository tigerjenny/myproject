package oo.mid;

import java.util.Scanner;

public class Meal {
	
	int[] meals = {150,100,250,130,120,200};
	int num;
	int price;
	String msg;
	
	public String Meal() {
		System.out.println("請輸入餐點號碼：");
		Scanner s = new Scanner(System.in);
		num = Integer.parseInt(s.nextLine());
	
		   if(num<0){
			   msg="error";
		   }else{
			  msg = "點餐成功！"; 
		   }
		return msg;
	}
	public void addmeal() {
		System.out.println("如果還要加點請按0:");
		Scanner s = new Scanner(System.in);
		int m = Integer.parseInt(s.nextLine());
		if(m==0){
			Meal();
		}else{
			money();
		}
	}
		public int money() {
			this.price=meals[num-1]+this.price;
			return this.price;
			
		}

}
