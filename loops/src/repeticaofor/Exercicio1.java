/*Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número 
deve ser menor do que o segundo número. Caso contrário, deve ser exibida uma mensagem na tela 
informando que o intervalo é inválido e sair do programa. 
No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.*/
package repeticaofor;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Digite o numero 1: ");
		numero1 = scan.nextInt();
		
		System.out.println("Digite um segundo numero maior que o primeiro: ");
		numero2 = scan.nextInt();
		
		if(numero2<numero1) {
			System.out.printf("Intervalo invalido! %d eh menor que %d.\nEncerrando programa.", numero2, numero1);
		}else {
			int cont = 0;
			for(int i = numero1; i != numero2; i++) {
				
				if((i % 3 == 0) && (i % 5 == 0)) {
					System.out.printf("%d eh multiplo de 3 e 5\n", i);
					cont++;
				}
			}
			System.out.printf("Existe %d numeros diviseis por 3 e 5 no intervalo de %d a %d.", cont, numero1, numero2);
		}
		
		scan.close();
	}
}
