package swithcase;

import java.util.Scanner;

/*Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá ler o tipo de operação 
 a ser realizada (número inteiro entre 1 e 3) e o valor a ser depositado
 ou sacado (somente nas opções 2 e 3). Considere que um saque só pode ser realizado caso haja saldo suficiente. 
 Ao final de cada operação, exiba o novo Saldo na tela. A variável saldo (float), será inicializada com o valor de R$ 1000.00. 
 Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida! */


public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcao;
		float saldo = 1000f, saque;
		
		System.out.println("""
				Seja bem vindo ao GenBank! Digite a opcao desejada:
				1 - SALDO
				2 - SAQUE
				3 - DEPOSITO
				""");
		opcao = scan.nextInt();
		switch(opcao) {
			case 1 -> System.out.printf("Saldo: %.2f\n", saldo);
			case 2 ->{
				System.out.println("Digite o valor que deseja sacar: ");
				saque = scan.nextFloat();
				if(saldo > 0 && saldo >= saque) {	
					System.out.printf("Saque realizado! Seu novo saldo eh: %.2f\n", (saldo-saque));
				}else {
					System.out.println("Saldo insuficiente!");
				}
			}
			case 3 -> {
				System.out.println("Digite o valor que deseja depositar: ");
				saldo += scan.nextFloat();
				System.out.printf("Deposito realziado! Seu novo saldo eh: %.2f", saldo);
			}
			default -> System.out.println("Opcao invalida!");
		}
		scan.close();

	}

}
