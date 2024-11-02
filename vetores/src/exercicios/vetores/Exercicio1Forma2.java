/*Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá
digitar um número e o programa deve exibir na tela a posição deste número no vetor.
Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser
exibida na tela*/

package exercicios.vetores;

import java.util.Scanner;

public class Exercicio1Forma2 {

	public static void main(String[] args) {
		
		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o numero que voce deseja encontrar: ");
		int numero = scan.nextInt();
		
		int posicao = buscaNumero(numero, vetor);
		
		if(posicao != -1) 
			System.out.printf("O numero %d esta localziado na posicao: %d\n", numero, posicao);
		else
			System.out.printf("O numero %d nao foi localizado\n", numero);
		
		scan.close();

	}
	
	public static int buscaNumero(int numero, int[] vetor) {
		
		for (int i = 0; i < vetor.length; i++) {
			if(numero == vetor[i]) 
				return i;
		}
		return -1;
	}

}
