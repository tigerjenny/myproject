package oo.mid;

import java.util.Scanner;

public class Meal {
	
	int[] meals = {150,100,250,130,120,200};
	int num;
	int price;
	String msg;
	
	public void meal() {
		System.out.println("請輸入餐點號碼：");
		Scanner s = new Scanner(System.in);
		String m = s.nextLine();
		this.num = Integer.parseInt(m);
		if(num<0){
			   System.out.println("error");
		   }else{
			   System.out.println("點餐成功！"); 
		   }
	}
	/*public String test(int num){
		num = this.num;
		if(num<0){
			   this.msg="error";
		   }else{
			  this.msg = "點餐成功！"; 
		   }
		return this.msg;
	}*/
	public void addmeal() {
		System.out.println("如果還要加點請按0:");
		Scanner s = new Scanner(System.in);
		int m = Integer.parseInt(s.nextLine());
		if(m==0) {
			meal();	
		}else{
			money();
		}
	}
		public int money() {
			this.price=meals[num-1]+this.price;
			return this.price;
			
		}

}
