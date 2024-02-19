package entities;

public class Banco {
	public String nome;
	public final  int numeroConta;
	public double deposito;
	
	public Banco(String nome, int numeroConta, double depositoInicial) {
		this.nome = nome;
		this.numeroConta =  numeroConta;
		deposito(depositoInicial);
	}
	public double deposito(double valorDeposito) {
		return deposito += valorDeposito;
	}
	public double saque(double valorSaque) {
		deposito = (deposito - valorSaque) - 5;
		return deposito;
	}
	
	
	
	
	
	
	
}
