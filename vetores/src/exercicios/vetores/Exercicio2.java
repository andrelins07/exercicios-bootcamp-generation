/*Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em
seguida, mostre na tela:
● Todos os elementos dos índices ímpares do vetor
● Todos os elementos do vetor que são números pares
● A Soma de todos os elementos do vetor
● A Média de todos os elementos do vetor, armazenada em uma variável do tipo real*/

package exercicios.vetores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		int soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o numero %d: \n", i+1);
			vetor[i] = scan.nextInt();
			soma += vetor[i];
			
		}
		
		System.out.println("\nElementos nos indices ímpares: ");
		for (int i = 1; i < vetor.length; i+=2) {	
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		
		System.out.println("Elementos pares: ");
		for (int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] % 2 == 0)
				System.out.print(vetor[i] + " ");
		}
		System.out.println();
		
		float media = (float) soma / 10;
		
		System.out.println("\nSoma: " + soma);
		System.out.printf("Média: %.2f", media);
		
		
		scan.close();
	}

}
