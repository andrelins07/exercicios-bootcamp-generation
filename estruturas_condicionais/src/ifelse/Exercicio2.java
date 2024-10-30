package ifelse;

import java.util.Scanner;

//Escreva um algoritmo em Java, que leia um número inteiro via teclado e 
//mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo.

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number;
		boolean continuar = true;
		
		while(continuar) {
			System.out.println("Digite o numero que deseja verificar ou 0 para SAIR: ");
			number = scan.nextInt();
			
			if(number == 0) {
				continuar = false;
			}
			else if(number % 2 == 0) {
				if(number > 0) System.out.printf("O numero %d eh par e positivo\n", number);
				else System.out.printf("o numero %d eh par e negativo\n", number);
			}
			else {
				if(number > 0) System.out.printf("o numero %d eh impar e positivo\n", number);
				else System.out.printf("o numero %d eh impar e negativo\n", number); 
			}
			System.out.println();
			 
		}
		System.out.println("Encerrando...");
		scan.close();
	}

}
