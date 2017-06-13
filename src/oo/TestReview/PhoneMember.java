package oo.TestReview;

public class PhoneMember extends Member {
	String phone;
	boolean verified = false;

	public PhoneMember() { // 若沒有建構子會自動產生，裡面會有一個super呼叫父類別的建構子
		super();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isVerified() { // 注意boolean值的get方法是前面加上is
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

}
