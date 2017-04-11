package oo.statics;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;

	// 右鍵source => generate constructor using field 可快速產生下面
	public Student(int english, int math, int chinese) {
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}

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
}