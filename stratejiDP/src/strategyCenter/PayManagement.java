package strategyCenter;

import tools.CashPayment;
import tools.models.IPayment;

public class PayManagement {
	
	public IPayment iPayment = new CashPayment(); // initial deger atamazsam NULLPE olur.
	
	public void payStrategy(IPayment iPayment) { // bu alan girilerek kullanici odeme tipini belirler. Secmezse yukarida CASH olarak atandi.
		this.iPayment = iPayment;
	}
			
	public void payWithAmount(double userAmount) {
		iPayment.pay(userAmount);
	}
}
