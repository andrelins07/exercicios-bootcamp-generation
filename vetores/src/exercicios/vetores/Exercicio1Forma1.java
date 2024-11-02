/*Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá
digitar um número e o programa deve exibir na tela a posição deste número no vetor.
Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser
exibida na tela*/

package exercicios.vetores;

import java.util.Scanner;

public class Exercicio1Forma1 {

	public static void main(String[] args) {
		
		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		Scanner scan = new Scanner(System.in);
		boolean encontrou = false;
		
		int opcao = 0;
		
		while(opcao != -1) {
			
			System.out.println("Digite o numero que voce deseja encontrar ou -1 para SAIR:");
			opcao = scan.nextInt();
			System.out.println("");
			
			if(opcao == -1)
				break;

			
			for (int i = 0; i < vetor.length; i++) {
				if(opcao == vetor[i]) {
					System.out.printf("O numero %d esta localizado na posicao: %d\n", opcao,i);
					encontrou = true;
					break;
				}
			}	
			
			if(!encontrou) {
				System.out.printf("O numero %d nao foi localizado\n", opcao);
			}
			encontrou = false;
		}
		
		System.out.println("Finalizando..");
		
		scan.close();

	}

}
