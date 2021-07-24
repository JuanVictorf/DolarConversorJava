package entities;

public class CurrencyConverter {
	public double dolarPrice;
	public double buyDolar;
	
	public static final double PI = 0.06;
	
	public double ConverterOperation() {
		return buyDolar * dolarPrice * (1.0 + PI);
	}
	
}
