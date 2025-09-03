package ativAula5;

public class PessoaJuridica extends Funcionario{
	
	private double valorBruto;
	private double imposto;
	private double salario;
	
	public PessoaJuridica(long id, String nome, String telefone, int matricula, String endereco, double valorBruto, double imposto) {
		super (id, nome, telefone, matricula, endereco);
		this.imposto = imposto;
		this.valorBruto = valorBruto;
	}
	
	public void calculaSalario() {
		salario = valorBruto - imposto;
		System.out.println("Salário: R$ " + salario);
	}


}
