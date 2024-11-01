/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe
Wrapper Integer, inicializada com 10 valores inteiros. O programa deverá solicitar ao
usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no Set,
exiba na tela a mensagem: Número 00 Encontrado! Caso o número não seja
encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!*/

package exercicios.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>(Arrays.asList(2,5,1,3,4,9,7,8,10)); //Iniciando o Set com valores pre-definidos
		//Collections.addAll(numeros,2,5,1,3,4,9,7,8,10); //Outra forma de inicializar a lista com valores pre-definidos
		
	
		
		System.out.println("Digite o numero que deseja encontrar: ");
		int numero = scan.nextInt(); //Lendo numero 
		
		if(numeros.contains(numero)) { //Verifica se o numero esta na lista
			System.out.printf("O numero %d foi encontrado na lista\n", numero);
		}else {
			System.out.printf("O numero %d nao foi localizado\n", numero);
		}
		
		System.out.println("\nLista de numeros: ");	
		numeros.forEach(n -> System.out.print(n + " ")); //Imprime a lista com foreach e lambda
		System.out.println("");
		
		
		scan.close();
	}

}
