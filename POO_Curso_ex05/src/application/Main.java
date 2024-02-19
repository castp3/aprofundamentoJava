package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double saldo;

		System.out.print("Digite o número da sua conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine(); // Consumir a quebra de linha restante
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		System.out.print("Você deseja adicionar um saldo inical?(sim/nao): ");
		String resp = sc.nextLine();
		String resp02 = resp.toUpperCase();

		if(resp02.equals("SIM")){
		    System.out.print("Digite o valor inicial da conta: ");
		    saldo = sc.nextDouble();
		}
		else {
		    saldo = 0.0;
		}

		Banco banco = new Banco(nome, numeroConta, saldo);

		System.out.println(" ");
		System.out.println("Dados Bancarios");
		System.out.println("Conta: "+banco.numeroConta+", Titular: "+banco.nome+", Saldo: "+banco.deposito);
		
		System.out.println(" ");
		System.out.print("Digite o valor do deposito: ");
		double vDeposito = sc.nextDouble();
		banco.deposito(vDeposito);
		System.out.println("Dados Bancarios");
		System.out.println("Conta: "+banco.numeroConta+", Titular: "+banco.nome+", Saldo: "+banco.deposito);
		
		
		System.out.println(" ");
		System.out.print("Digite o valor do saque: ");
		double vSaque = sc.nextDouble();
		banco.saque(vSaque);
		System.out.println("Dados Bancarios");
		System.out.printf("Conta: "+banco.numeroConta+", Titular: "+banco.nome+", Saldo: "+banco.deposito);
		
		
		
		sc.close();
	}

}
