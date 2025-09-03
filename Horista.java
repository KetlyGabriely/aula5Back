package ativAula5;

public class Horista extends Funcionario {
	
	private double valorHora;
	private int quantidadeHoras;
	private double salario;
	
	public Horista(long id, String nome, String telefone, int matricula, String endereco, double valorHora, int quantidadeHoras) {
		super(id, nome, telefone, matricula, endereco);
		this.quantidadeHoras = quantidadeHoras;
		this.valorHora = valorHora;
	}
	
	public void calculaSalario() {
		salario = valorHora * quantidadeHoras;
		System.out.println("Salário: R$ "+ salario);
	}

}
