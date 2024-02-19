package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stubLocale.setDefault(Locale.US);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x,y; //Estancia a classe 
		x = new Triangulo(); //Objeto x e a classe triangulo são iguais 
		y = new Triangulo(); // Objeto y e a classe triangulo são iguais 
		
		System.out.println("Digite os lados do triângulo X: "); //Entrada de valores para os atributos 
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os lados do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();

		
		System.out.printf("A area do triângulo X é: %.2f %n", areaX);
		System.out.printf("A area do triângulo Y é: %.2f %n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A area do triângulo X é maior");
		}
		else {}
			System.out.println("A area do triângulo Y é maior");

	}

}
