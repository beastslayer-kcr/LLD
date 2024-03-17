package strategyDesignPattern;

public class PaymentProcessor {
	private PaymentStartegy paymentStrategy;

	public PaymentProcessor(PaymentStartegy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	public void processPayment(double amount) {
        paymentStrategy.processPayment(amount);
    }
}
