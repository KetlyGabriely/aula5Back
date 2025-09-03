package ativAula5;

public class Jornada extends Funcionario {
	
	private double salarioHora;
	private int horasTrabalhadas;
	private double salario;
	
	public Jornada(long id, String nome, String telefone, int matricula, String endereco, double salarioHora, int horasTrabalhadas) {
		super(id, nome, telefone, matricula, endereco);
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioHora = salarioHora;
	}
	
	public void calculaSalario() {
		salario = horasTrabalhadas * salarioHora;
		System.out.println("Salário: R$ " + salario);
	}

}
