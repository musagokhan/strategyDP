This project explain the basic strategy design pattern with pay example.

1. tools.models.IPayment	: this one is Interface for pay operation
2. tools.CashPayment 		: this one is implemented from IPayment.
3. tools.CrediCardPayment	: this one is implemented from IPayment.
4. strategyCenter.PayManagement: this one is use IPayment. Thanks to the class IPayment that creates this class, its subclasses pass to the "payStrategy" method. Thus, the strategy is determined.
1. mainOp.MainOperation: 	: Payment strategy is determined using "strategy Center.pay Strategy". Payment amounts are made through 2 different users for 2 different payments.