package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Digite a largura e a altura do retangulo: ");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();
		
		double area = retangulo.area();
		double perimetro = retangulo.Perimetro();
		double diagonal = retangulo.diagonal();
		
		System.out.println("AREA: "+area);
		System.out.println("PERIMETRO: "+perimetro);
		System.out.println("Diagonal: "+diagonal);
	}

}
