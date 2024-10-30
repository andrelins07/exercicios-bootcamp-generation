package ifelse;

import java.util.Scanner;

//Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e 
//imprima na tela se a soma de A + B é maior, menor ou igual a C.

public class Exercicio1 {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numeroA, numeroB, numeroC;
		
		numeroA = lerInt("Digite o valor de A");
		numeroB = lerInt("Digite o valor de B");
		numeroC = lerInt("Digite o valor de C");
		
		if((numeroA + numeroB) > numeroC) System.out.println("A soma de A + B eh MAIOR que C");
		else if((numeroA + numeroB) < numeroC) System.out.println("A soma de A + B eh MENOR que C");
		else System.out.println("A soma de A + B eh IGUAL a C");
		
		System.out.println("\n[A + B]: " + (numeroA + numeroB) + "\n" + "[C]: " + numeroC);
		
		scan.close();
	}
	
	public static int lerInt(String mensagem) {
		System.out.println(mensagem);
		return scan.nextInt();
	}

}
