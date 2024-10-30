package swithcase;

import java.util.Scanner;

/*Escreva um algoritmo em Java, que simule uma Calculadora simples. 
 * O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o 
 * Código da operação matemática (número inteiro de 1 a 4). A seguir, mostre na tela o resultado da operação entre os 2 números. 
 * Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!
*/
public class Exercicio7 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero 1: ");
		float numero1 = scan.nextFloat();
		
		System.out.println("Digite o numero 2: ");
		float numero2 = scan.nextFloat();
		
		System.out.println("Digite a operacao: ");
		System.out.println("""
				1 - SOMA
				2 - SUBTRACAO
				3 - MULTIPLICACAO
				4 - DIVISAO
				""");
		byte operacao = scan.nextByte();
		
		switch(operacao) {
			case 1 -> System.out.printf("A soma eh: %.2f\n", (numero1+numero2)); 
			case 2 -> System.out.printf("A subtracao eh: %.2f\n", (numero1-numero2));
			case 3 -> System.out.printf("A multiplicacao eh: %.2f\n", (numero1*numero2));
			case 4 -> {
				if(numero2 != 0)
					System.out.printf("A divisao eh: %.2f\n", (numero1/numero2));
				else
					System.out.println("Nao eh possivel dividir por zero!\n");
			}
			default -> System.out.println("OPERCAO INVALIDA!");
			
		}
		scan.close();
		
	}

}
