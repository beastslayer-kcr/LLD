package strategyDesignPattern;

public class Main {
	public static void main(String[] args) {
		CreditCardPaymentStrategy paymentStrategy = new CreditCardPaymentStrategy();
		PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
		paymentProcessor.processPayment(10000.00);
	}
}
