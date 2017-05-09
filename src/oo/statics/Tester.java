package oo.statics;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		//System.out.println(Student.pass); //pass在沒有物件時就已存在
		Student student = new Student();
		System.out.println(student);		//一定要覆寫toString()才會輸出值
		
		
		Student stu1 = new Student(66, 77, 88);
		Student stu2 = new Student(33,55,80);
		stu1.pass = 60;
		stu1.print();
		stu2.print();
		GraduateStudent gstu = new GraduateStudent(66, 88, 74);
		gstu.print();
		//
		ArrayList<Student> list = new ArrayList();
		list.add(new Student(66, 77, 88));
		list.add(new Student(33,55,80));
		list.add(new GraduateStudent(66, 88, 74));
		for(int i=0;i<list.size();i++){
			Student stu = list.get(i);
			stu.print();
		}
	}

}
