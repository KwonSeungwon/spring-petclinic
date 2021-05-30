package org.springframework.samples.petclinic.proxy;

public class Cash implements Payment {

	@Override
	public void pay(int mount) {
		System.out.println("현금결제!");
	}

}
