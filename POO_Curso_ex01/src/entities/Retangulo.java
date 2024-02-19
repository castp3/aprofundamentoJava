package entities;

public class Retangulo {
	public double altura;
	public double largura;
	
	public double area(){
		return this.altura * this.largura;
		
	}
	public double Perimetro(){
		return (this.altura * 2) + (this.largura * 2);
	}
	
	public double diagonal() {
	double quadrado = (this.altura * this.altura) + (this.largura * this.largura);
	return Math.sqrt(quadrado);
	
	}
}
