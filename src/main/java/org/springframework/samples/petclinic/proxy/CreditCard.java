package org.springframework.samples.petclinic.proxy;

import org.springframework.util.StopWatch;

public class CreditCard implements Payment {

	Payment cash = new Cash();

	@Override
	public void pay(int amount) {
		if(amount > 100) { // CreditCard 클래스가 Cash클래스에 신용카드 결제라는 기능을 대신 구현해줌.(본 클래스는 변경X)
			System.out.println(amount + "신용카드");
		} else {
			cash.pay(amount);
		}
	}
}
