package ativAula5;

public class ObjetoFuncionario {
	public static void main(String[] args) {
		
		Jornada func1 = new Jornada(001, "Pedro", "15991234567", 25652148, "Rua Oi, número 111", 50.00, 8);
		func1.exibirFuncionario();
		func1.calculaSalario();
		
		System.out.println();

		Horista func2 = new Horista(002, "Maria", "11998745612", 5241856, "Rua Principal, número 22", 75.00, 6);
		func2.exibirFuncionario();
		func2.calculaSalario();
		
		System.out.println();
		
		PessoaJuridica func3 = new PessoaJuridica(003, "Julia", "11987654321", 5615148, "Avenida Brasil, número 93", 10000.00, 750.00);
		func3.exibirFuncionario();
		func3.calculaSalario();
		
	}
}
