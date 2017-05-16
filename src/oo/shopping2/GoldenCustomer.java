package oo.shopping2;

public class GoldenCustomer extends SilverCustomer{
float returnmoney = 0.05f;
	
	public GoldenCustomer(int amount) {
		super(amount);
	}

	@Override
	public void print() {
		System.out.println(amount+"\t"+(amount*discount)+"\t"+(amount*returnmoney));
	}
	
}