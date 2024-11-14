package tools;

import tools.models.IPayment;

public class CrediCardPayment implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("Odeme Kredi Kartı ile yapıldı. Tutar : " + amount);		
	}
}
