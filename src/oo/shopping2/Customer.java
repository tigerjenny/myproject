package oo.shopping2;

public abstract class Customer {
	int amount;
	float discount = 0.9f;

	public Customer(int amount) {
		this.amount = amount;
	}

	public abstract void print();

}