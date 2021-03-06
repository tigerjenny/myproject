package oo.shopping2;

public class SilverCustomer extends Customer {

	public SilverCustomer(int amount) {
		super(amount);
	}

	@Override
	public void print() {
		System.out.println(amount + "\t" + (amount * discount) + "\t0");
	}

}