package oo.abs2; //抽象類別的設計  不可以new出變成一個物件

public abstract class Report { // 如果要強制子類別覆寫方法需要在class和方法前加上abstract
	public void test() {

	}

	public abstract void print(); // 強制子類別覆寫方法，方法的身體要去掉
}
