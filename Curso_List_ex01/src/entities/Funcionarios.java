package entities;

public class Funcionarios {
	private String nome;
	private Double salario;
	private Integer id;
	
	
	public Funcionarios(String nome, double salario, int id) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	public void aumentaSalario(double percentual) {
		salario += salario * percentual / 100;
	}
	
	
}
