package oo.shopping;

public class GoldenCustomer extends Customer {
	@Override
	public void enter() {
		super.enter();
		discountpay = (int) (pay * 0.9);
		returnmoney = (int) (pay * 0.05);
		System.out.println("消費金額：" + pay + "\t" + "折扣後：" + discountpay + "\t" + "還原金:" + returnmoney);
	}
	/*
	 * @Override public void show(){ System.out.println("消費金額："+ pay
	 * +"\t"+"折扣後："+discountpay+"\t"+"還原金:"+returnmoney); }
	 */

}
