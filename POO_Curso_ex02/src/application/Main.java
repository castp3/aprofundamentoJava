package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		double salarioLiquido = func.salarioLiquido();
		
		
		System.out.println("Funcionario: "+func.nome+", $ "+salarioLiquido);
		
		System.out.print("Digite o percentual de aumento: ");
		double percem = sc.nextDouble();
		
		double aumentoSalario = func.aumento(percem);
		
		System.out.printf("Novo Salario: $ %.2f %n",aumentoSalario);

	}

}
