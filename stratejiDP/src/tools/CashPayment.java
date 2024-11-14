package tools;

import tools.models.IPayment;

public class CashPayment implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("Odeme Nakti olarak yapıldı. Tutar : " + amount);
	}
}
