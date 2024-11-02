/*Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida,
mostre na tela:
	● Todos os elementos da Diagonal Principal
	● Todos os elementos da Diagonal Secundária
	● A Soma de todos os elementos da Diagonal Principal
	● A Soma de todos os elementos da Diagonal Secundária*/

package exercicios.matrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int tamanho = 3, somaDiagonalPrincipal = 0,somaDiagonalSecundaria = 0;
		int[][] matriz = new int[tamanho][tamanho]; 

		System.out.println("Digite os elementos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("Posicao [%d][%d]: ", i, j);
				matriz[i][j] = scan.nextInt(); //Inserindo elementos na matriz
			}
		}

		System.out.println("\nElementos da Diagonal Principal:");
		for (int i = 0; i < tamanho; i++) {	
			System.out.print(matriz[i][i] + " "); //A diagonal principal ocorre quando o numero da coluna e da linha são os mesmos 
			somaDiagonalPrincipal += matriz[i][i]; //Soma elementos da diagonal principal
		}
		
		System.out.println("\nElementos da Diagonal Secundária:");
		for (int i = 0; i < tamanho; i++) {
			System.out.print(matriz[i][(tamanho-1) - i] + " ");
			somaDiagonalSecundaria += matriz[i][(tamanho-1) - i]; //Soma elementos da diagonal secundaria
		}
		
		System.out.println("");
		
		System.out.println("\nSoma da Diagonal Principal: " + somaDiagonalPrincipal);
		System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);

		scan.close();
	}

}
