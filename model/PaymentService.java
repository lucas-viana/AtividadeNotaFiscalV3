package model;

public class PaymentService {
	
	public static void processPayment(Sale priceSale , Payment payment) {
		double price = payment.calculatedTax(priceSale);
		System.out.println(payment.toString());
		System.out.println(payment.calculatedTax(priceSale));
	}
}
