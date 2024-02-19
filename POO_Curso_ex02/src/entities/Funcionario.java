package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido(){
		return this.salarioBruto - this.imposto;
	}
	public double aumento(double porcentagem){
		double porcem = porcentagem / 100;
		double salarioLiquido = this.salarioBruto - this.imposto;
		 return  salarioLiquido+= this.salarioBruto * porcem;
		
	}
	
}
