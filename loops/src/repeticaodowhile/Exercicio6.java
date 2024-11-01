/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o
número zero seja digitado. Ao final, mostre na tela a média de todos os números
digitados, que sejam múltiplos de 3*/
package repeticaodowhile;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
	
		int opcao, soma = 0, cont = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite o numero desejado");
			opcao = scan.nextInt(); //Entrada dos numeros inteiros
			
			if(opcao % 3 == 0 && opcao > 0) { //Verifica multiplicidade por 3 e numeros positivos
				soma += opcao; //Soma os numeros
				cont++; //Conta quantos numeros obedecem aos criterios
			}
			
		}while(opcao != 0); //Verifica condicao de parada
		
		float media = (float) soma/cont; //Casting de inteiros para float
		
		System.out.printf("A media de todos os números multiplicos de 3 é: %.2f ", media); //Imprime a media com duas casas decimais
				
		scan.close();
	}
}