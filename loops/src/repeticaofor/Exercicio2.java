//Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos 
//números são pares e quantos número são ímpares
package repeticaofor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero;
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("Digite o numero %d: \n", i);
			numero = scan.nextInt();
			
			if(numero % 2 == 0) pares.add(numero);
			else impares.add(numero);
		}
		System.out.println("\nTotal de numeros pares: " + pares.size() + "\n" + pares);
		System.out.println("\nTotal de numeros impares: " + impares.size() + "\n" + impares);
		
		scan.close();

	}

}
