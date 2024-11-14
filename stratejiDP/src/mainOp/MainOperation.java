package mainOp;

import strategyCenter.PayManagement;
import tools.CashPayment;
import tools.CrediCardPayment;

public class MainOperation {

	public static void main(String[] args) {
		double user1Amount = 0.90;
		double user2Amount = 66.66;
		
		CashPayment cashPayment = new CashPayment();
		CrediCardPayment crediCartPayment = new CrediCardPayment();
		
		PayManagement user1 = new PayManagement();
		PayManagement user2 = new PayManagement();
		
		
		user1.payStrategy(cashPayment);     // user1 CASH odeyecek. seçmeseydi: Manager CASH2e mecbur bırakırdı.
		user2.payStrategy(crediCartPayment);// user1 CC odeyecek.   seçmeseydi: Manager CASH2e mecbur bırakırdı.

		user1.payWithAmount(user1Amount); // pamuk eller cebe CASH olararak user1Amount kadar gider.
		user2.payWithAmount(user2Amount); // pamuk eller cebe  CC  olararak user2Amount kadar gider.
	}
}