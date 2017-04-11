package oo.statics;

public class Tester {

	public static void main(String[] args) {
		System.out.println(Student.pass); //pass在沒有物件時就已存在
		Student stu1 = new Student(65, 77, 90);
		Student stu2 = new Student(45, 80, 67);
		stu1.pass = 70;
		stu1.print();
		stu2.print();

	}

}
