package model;

public class MoneyPix implements Payment{
	
	@Override
	public double calculatedTax(Sale sale) {
		return sale.getTotal() - (sale.getTotal()*0.05);
	}

	@Override
	public String toString() {
		return "Pix/Dinheiro";
	}

}
