package aula5;

import java.util.Scanner;

public class ObjetoCalculos {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		double num1 = ler.nextInt();
		
		System.out.println("Informe o segundo número: ");
		double num2 = ler.nextInt();
		
		ler.close();
		
		Calculando test = new Calculando(num1,num2);
		
		test.somar();
		test.sub();
		test.mult();
		test.div();
		test.exp();
	}

}
