/* Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. O programa deverá solicitar ao usuário, 
 * que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
	● Mostre na tela todas as cores que foram adicionadas.
	● Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente*/
package exercicios.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();
		
		for (int i = 1; i <= 5; i++) {	//Laco para adicionar as cores 
			System.out.println("Digite a cor " + i);
			cores.add(scan.nextLine()); //Adicionando cores na lista
		}
		
		System.out.println("\nCores adicionadas: ");
		
		cores.forEach(cor-> System.out.print("'" + cor + "'" + " ")); //Impressao via foreach e lambda
		System.out.println();
		
		System.out.println("\nCores ordenadas alfabeticamente: ");
		
		Collections.sort(cores);
		
		cores.forEach(cor-> System.out.print("'" + cor + "'" + " ")); //Impressao via foreach e lambda
		
		scan.close();
	}

}
