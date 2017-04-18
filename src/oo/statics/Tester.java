package oo.statics;

public class Tester {

	public static void main(String[] args) {
		//System.out.println(Student.pass); //pass在沒有物件時就已存在
		
		Student stu1 = new Student();
		Student stu2 = new Student();
		stu1.pass = 60;
		stu1.print();
		stu2.print();

	}

}
