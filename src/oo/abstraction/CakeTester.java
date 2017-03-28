package oo.abstraction;

public class CakeTester {

	public static void main(String[] args) {
		// Cake cake n = new Cake(名稱,熱量,售價,成本);
		Cake cake1 = new Cake("草莓蛋糕", 180, 45, 30);
		Cake cake2 = new Cake("巧克力蛋糕", 250, 50, 35);
		Cake cake3 = new Cake("檸檬蛋糕", 160, 45, 30);

		Cake[] cakes = new Cake[3];
		cakes[0] = new Cake("草莓蛋糕", 180, 45, 30);
		cakes[1] = new Cake("巧克力蛋糕", 250, 50, 35);
		cakes[2] = new Cake("檸檬蛋糕", 160, 45, 30);

		cakes[0].id = 001;
		cakes[1].id = 002;
		cakes[2].id = 003;
		System.out.println(cakes[1].price);
		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.println(cakes[i].name);
		}
		System.out.println(i);
	}

}
