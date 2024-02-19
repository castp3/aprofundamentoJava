package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno al = new Aluno();

		System.out.println("Bem vindo a escola 'Me tira daqui Mãe'");
		System.out.print("Nome: ");
		al.nome = sc.next();
		System.out.print("Nota 1º Trimestre: ");
		al.nota01 = sc.nextDouble();
		System.out.print("Nota 2º Trimestre: ");
		al.nota02 = sc.nextDouble();
		System.out.print("Nota 3º Trimestre: ");
		al.nota03 = sc.nextDouble();
		
	
		
		System.out.printf("Nome: %s, Nota Final: %.1f %n", al.nome, al.notaFinal());
		
		if (al.notaFinal() < 60.0) {
			System.out.println("NÃO PASSOU");
			System.out.printf("FALTOU %.2f PONTOS %n", al.faltaPontos());
			}
			else {
			System.out.println("PASSOU");
			}
			sc.close();

	}

}
