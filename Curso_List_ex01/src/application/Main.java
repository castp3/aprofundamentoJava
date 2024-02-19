package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos funcionarios você vai inserir?");
		int n = sc.nextInt();
		
		Integer id;
		Double salario;
		String nome;
		
		List<Funcionarios> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println(" ");
			System.out.println("Fúncionario #"+(i+1));
			System.out.print("ID: ");
			id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.print("Salário: ");
			salario = sc.nextDouble();
			
			Funcionarios func = new Funcionarios(nome, salario, id);
			list.add(func);
			
			
		}
		System.out.println(" ");
		System.out.print("Digite o ID do fúncionario que vai receber o aumento: ");
		int idSalario = sc.nextInt();
		Integer pos = position(list, idSalario);
		if(pos == null) {
			System.out.println("ESSE ID NÃO EXISTE");
		}
		else {
			System.out.print("Digite a porcentagem:");
			double percen = sc.nextDouble();
			list.get(pos).aumentaSalario(percen);
		}
		
		System.out.println(" ");
		System.out.println("Lista de Funcionarios: ");
		for(Funcionarios f : list) {
			System.out.println("  ");
			System.out.println("ID: "+f.getId());
			System.out.println("Nome: "+f.getNome());
			System.out.println("Sálario: "+f.getSalario());
		}
	}
	
	public static Integer position(List<Funcionarios> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
