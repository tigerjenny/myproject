package oo.shopping;

import java.util.Scanner;

public class Customer {
	int pay ;
	int discountpay ;
	int returnmoney ;
	
	public void enter() {
		System.out.println("請輸入消費金額：");
		Scanner scanner = new Scanner(System.in);
		this.pay  = Integer.parseInt(scanner.nextLine());
		discountpay = pay;
		}
	
	public void show() {
		System.out.println("消費金額："+ pay +"\t"+"折扣後："+discountpay+"\t"+"還原金:"+returnmoney);
	}

}
