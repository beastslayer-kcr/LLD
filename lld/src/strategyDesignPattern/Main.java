package strategyDesignPattern;

public class Main {
	public static void main(String[] args) {
		
		//credit card payment 
		CreditCardPaymentStrategy paymentStrategy = new CreditCardPaymentStrategy();
		PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
		paymentProcessor.processPayment(10000.00);
		
		//Debit card Payment
		PaymentProcessor DebitpaymentProcessor = new PaymentProcessor( new DebitCardPaymentStartegy());;
		DebitpaymentProcessor.processPayment(9999.00);
		
		//paypal Payment
		PaymentProcessor paypalDesignPattern = new PaymentProcessor( new PaypalDesignPattern());;
		paypalDesignPattern.processPayment(8888.00);
		
	}
}
