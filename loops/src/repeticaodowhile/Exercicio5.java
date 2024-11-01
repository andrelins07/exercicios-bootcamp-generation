/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o
número zero seja digitado. Ao final, mostre na tela a soma de todos os número
digitados, que sejam positivos*/

package repeticaodowhile;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int soma = 0, opcao;
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite o numero desejado");
			opcao = scan.nextInt(); //Entrada dos numeros inteiros
			
			if(opcao > 0)	//verifica se e positivo
				soma += opcao; //Faz a operacao de soma
			
		}while(opcao != 0); //Verifica condicao de parada
		
		System.out.println("A soma dos numeros positivos é: " + soma); //imprime resultado
		
		scan.close();
	}

}
