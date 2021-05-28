package org.springframework.samples.petclinic.proxy;

public class Stroe {

	Payment payment;

	public Stroe(Payment payment) { // 의존성주입
		this.payment = payment;
	}

	public void buySomeThing() {
		payment.pay(100);
	}

}
