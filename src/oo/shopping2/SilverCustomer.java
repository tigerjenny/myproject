package oo.shopping2;

public class SilverCustomer extends Customer{
	float discount = 0.9f;
	
	public SilverCustomer(int amount) {
		super(amount);
	}

	@Override
	public void print() {
		System.out.println(amount+"\t"+(amount*discount)+"\t0");
	}
	

}