package oo.shopping;

import java.util.Scanner;

public class CountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("一般客戶請輸1，銀級客戶請輸2，金級客戶請輸3");
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		try {
			n = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("格式輸入錯誤！");
		}
		Customer cus = new Customer();
		SilverCustomer silcus = new SilverCustomer();
		GoldenCustomer godcus = new GoldenCustomer();

		switch (n) {
		case 1:
			cus.enter();
			cus.show();
			break;
		case 2:
			silcus.enter();
			// silcus.discount();
			// silcus.show();
			break;
		case 3:
			godcus.enter();
			// godcus.discount();
			// godcus.show();
			break;
		default:
			System.out.println("wrong");
			break;
		}

	}

}
