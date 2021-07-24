package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Dolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter dolar = new CurrencyConverter();
		
		System.out.println("Qual o preço do dólar: ");
		dolar.dolarPrice = sc.nextDouble();
		
		System.out.println("Quantos dólares quer comprar?");
		dolar.buyDolar = sc.nextDouble();
		
		System.out.printf("Valor final em reais: %.2f%n ", dolar.ConverterOperation());
		
		sc.close();
		
		
	}

}
