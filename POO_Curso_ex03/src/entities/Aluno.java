package entities;

public class Aluno {
	public String nome;
	public double nota01;
	public double nota02;
	public double nota03;
	
	public double notaFinal(){
		return this.nota01 + this.nota02 + this.nota03;
	}
	public double faltaPontos(){
		if(notaFinal()< 60){
			return 60 - notaFinal();
		}
		else{
			return 0.0;
		}
	}
}
