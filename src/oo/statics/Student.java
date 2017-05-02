package oo.statics;

import java.util.Scanner;

public class Student {					//如果前面的public刪掉，則只有同一個package的class可以使用
	int english;
	int math;
	int chinese;
	static int pass = 60;
	static{
		System.out.println("STATIC!!");
		//System.out.println(english);  =>這行會出錯，因為此行會先執行，english還沒產生。
		System.out.println(pass); 		//因為pass也是static值，所以此行可以產生成功。
	}									//會在tester裡先執行，在還沒有物件產生時，就會執行出來。

	static {
		System.out.println("Haha, enter the score!!");
	}
	// 右鍵source => generate constructor using field 可快速產生下面
	/*public Student(int english, int math, int chinese) {
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}*/

	public void print() {
		System.out.println(getScore(english) + "\t" +
				getScore(math) + "\t" + getScore(chinese));
	}

	private String getScore(int score) {
		if (score < pass) {
			return String.valueOf(score) + "*";
		} else {
			return String.valueOf(score);
		}
	}
	public Student(){						//如果前面的public刪掉，則只有同一個package的class可以使用
		System.out.println("請輸入學生成績：\n 英文:");
		Scanner scanner = new Scanner(System.in);
		this.english  = Integer.parseInt(scanner.nextLine());
		System.out.print("數學:");
		scanner = new Scanner(System.in);
		this.math = Integer.parseInt(scanner.nextLine());
		System.out.print("國文:");
		scanner = new Scanner(System.in);
		this.chinese = Integer.parseInt(scanner.nextLine());
	}
}
