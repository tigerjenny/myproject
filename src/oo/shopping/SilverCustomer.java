package oo.shopping;

public class SilverCustomer extends Customer {

	public void enter() {
		super.enter();
		discountpay = (int) (pay * 0.9);
		System.out.println("消費金額：" + pay + "\t" + "折扣後：" + discountpay + "\t" + "還原金:" + returnmoney);
	}

	/*
	 * @Override public void discount() { discountpay = (int) (pay*0.9); }
	 */
	/*
	 * @Override public void show(){ System.out.println("消費金額："+ pay
	 * +"\t"+"折扣後："+discountpay+"\t"+"還原金:"+returnmoney); }
	 */

}
