package oo.io;

import java.io.FileOutputStream;
import java.util.Scanner;

public class SumScore {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("請輸入成績：");
			String data = scanner.nextLine();
			try {
				int score = Integer.parseInt(data);
				sum = sum + score;
			} catch (NumberFormatException e) {
				System.out.println("成績格式不符規定：");
				i--;
			}
		}
		System.out.println(sum);

		// FileOutputStream fos = new FileOutputStream("data.txt");
	}

}
