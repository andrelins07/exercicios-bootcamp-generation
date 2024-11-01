/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe
Wrapper Integer. O programa deverá solicitar ao usuário, que ele digite via teclado
10 valores inteiros não repetidos e adicione-os individualmente na Collection Set.
Em seguida, faça o que se pede:
	● Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator*/

package exercicios.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int i = 1; i<= 10; i++) {
			System.out.println("Entre com o numero "+ i);
			numeros.add(scan.nextInt());	//Leitura e adicao dos numeros na lista
		}
		
		Iterator<Integer> iterator = numeros.iterator(); //Criando objeto iterator
		
		System.out.println("\nListando numeros: ");
				
		while(iterator.hasNext()) {
			System.out.println(iterator.next());	//Imprimindo lista via iterator
		}
		scan.close();

	}

}
