//Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
//via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas 
//cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa.
package repeticaowhile;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean continuar = true;
		int idade, cont1 = 0, cont2 = 0;
		
		while(continuar) {
			System.out.println("Digite a sua idade: ");
			idade = scan.nextInt();
			
			if(idade < 0) break;
			if(idade < 21) cont1++;	
			if(idade > 50) cont2++;
	
		}
		System.out.println("Total de pessoas menores de 21 anos: " + cont1);
		System.out.println("Total de pessoas maiores de 50 anos: " + cont2);
		
		scan.close();

	}

}
