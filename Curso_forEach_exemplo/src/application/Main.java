package application;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nome = new String[] {"Maria", "Alex", "João","Felipe"};
		
		for(int i = 0; i < nome.length; i++) { //laço normal 
			System.out.println(nome[i]);
		}
		
		System.out.println("------------------------------------");
		
		for(String obj : nome) { //laço for each
			System.out.println(obj);
		}

	}

}
