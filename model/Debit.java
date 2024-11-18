package model;

public class Debit implements Payment{
	
	@Override
	public double calculatedTax(Sale sale) {
		return sale.getTotal();
	}
	
	@Override
	public String toString() {
		return "Cartao de Debito";
	}

}
