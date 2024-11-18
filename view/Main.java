package view;

import java.util.Scanner;

import model.CreditCard;
import model.Debit;
import model.MoneyPix;
import model.PaymentService;
import model.Product;
import model.SaleItem;
import model.Sale;
import model.Payment;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sale salePix = new Sale();
		salePix.createSaleItem("at", 2);
		salePix.createSaleItem("ff", 1);
		salePix.createSaleItem("msa", 2);
		
		Sale saleCredit = new Sale();
		saleCredit.createSaleItem("at", 2);
		saleCredit.createSaleItem("ff", 1);
		saleCredit.createSaleItem("msa", 2);
		
		Sale saleDebit = new Sale();
		saleDebit.createSaleItem("at", 2);
		saleDebit.createSaleItem("ff", 1);
		saleDebit.createSaleItem("msa", 2);
		
		for(Object item : salePix.getItems())
			System.out.println(item);
		
		System.out.println(String.format("Total: %.2f",salePix.getTotal()));
		
		Payment pay = new CreditCard();
		PaymentService.processPayment(saleCredit, pay);
		
		pay = new MoneyPix();
		PaymentService.processPayment(saleCredit, pay);
		
		pay = new Debit();
		PaymentService.processPayment(saleCredit, pay);
		

		
}
}
