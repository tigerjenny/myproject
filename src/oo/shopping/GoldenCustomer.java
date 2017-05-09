package oo.shopping;

public class GoldenCustomer extends SilverCustomer {
	@Override
	public void discount() {
		discountpay= (int) (pay*0.9);
		returnmoney = (int) (pay*0.05);
	}
	@Override
	public void show(){
		System.out.println("消費金額："+ pay +"\t"+"折扣後："+discountpay+"\t"+"還原金:"+returnmoney);
	}


}
