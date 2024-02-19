package application;

import java.util.Locale;
import java.util.Scanner;

import until.ConversorDolar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dolar? ");
		ConversorDolar.dolar = sc.nextDouble();
		
		System.out.print("Quantos dolar você quer comprar? ");
		double compra = sc.nextDouble();
		
		double valorPagamento = ConversorDolar.Conversor(compra);
		
		System.out.printf("O valor a ser pago em R$: %.2f %n", valorPagamento);

	}

}
