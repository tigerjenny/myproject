package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceHomework {

	public static void main(String[] args) {
		// 本次開獎號碼 331 821 886 554 讓使用者輸入發票號碼（長度不限）判斷尾數3位是否中獎(用Arraylist)
		/*System.out.println("請輸入發票號碼：");
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		String s = "331";
		//------------0123456789
		//String n = "1234567331";
		System.out.println(n.length());
		String sub = n.substring(n.length()-3);
		System.out.println(sub);
		if(s.equals(sub)){
			System.out.println("恭喜中獎！！");
		}else{
			System.out.println("下次加油～～");
		}
		*/
		
		
		ArrayList<String> a = new ArrayList();
		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		System.out.println("請輸入發票號碼：");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		System.out.println(num.length());
		String sub = num.substring(num.length()-3);
		System.out.println(sub);
		if(a.equals(sub)){
			System.out.println("恭喜中獎！！");
		}else{
			System.out.println("下次加油～～");
		}
		
	}

}
