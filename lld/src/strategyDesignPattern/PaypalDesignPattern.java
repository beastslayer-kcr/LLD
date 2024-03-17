package strategyDesignPattern;

public class PaypalDesignPattern implements PaymentStartegy{

	@Override
	public void processPayment(Double amount) {
		System.out.println(amount + " rs  payment is done by paypal");	
		
	}

}
