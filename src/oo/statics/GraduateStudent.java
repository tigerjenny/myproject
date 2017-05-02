package oo.statics;

public class GraduateStudent extends Student {
	int thesis;						//建構子不會繼承
	public GraduateStudent(int english, int math, int chinese) {
		this.english = english;
		this.math = math;
		this.chinese = chinese;
		}
}
