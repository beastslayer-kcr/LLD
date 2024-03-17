package strategyDesignPattern;

public class CreditCardPaymentStrategy implements PaymentStartegy{

	@Override
	public void processPayment(Double amount) {
		System.out.println(amount + " rs  payment is done by credit card");	
	}

}
