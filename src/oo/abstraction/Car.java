package oo.abstraction;

public class Car {
	int id;
	int cc;
	String brand;
	String name;
	int status;
	float milage; //屬性多名詞

	public Car(int cc, String name, String brand) {
		this.cc = cc;
		this.name = name;
		this.brand = brand;
	}
	public void maintain(){
		status=5;
	} //創一個方法（多動詞）
	public void setMileage(int m){
		milage = m;
	}
	public float addMilage(int m){
		if(m<0){
			System.out.println("error");
		}else{
		milage = milage + m;
		}
		return milage;
	}
}
