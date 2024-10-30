package exercicios;

import java.util.Scanner;

/*Desenvolva um algoritmo que receba o valor do salário e do abono em variavies
do tipo float e exiba na tela a soma*/

public class Exercicio1 {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float salario, abono;
		
		salario = lerFloat("Digite o valor do salario: ");
		abono = lerFloat("Digite o valor do abono: ");
		
		System.out.println("O novo salario eh: " + (salario+abono));
	
		scan.close();
		
	}
	
	public static float lerFloat(String mensagem) {
		
		System.out.println(mensagem);
		return scan.nextFloat();

	}
	
}
