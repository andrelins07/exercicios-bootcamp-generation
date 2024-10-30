/*Para doar sangue é necessário ter entre 18 e 69 anos de idade. 
 *Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. 
 *Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador 
 *e se é a primeira doação (boolean). De acordo com as Regras para a doação, 
 *mostre na tela se o doador está Apto ou Não Apto para doar sangue*/
package ifelse;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome;
		int idade;
		boolean isDoador;
		
		System.out.println("Digite o seu nome: ");
		nome = scan.nextLine();
		
		System.out.println("Digite a sua idade: ");
		idade = scan.nextInt();
		
		System.out.println("É a sua primeira doacao ? Respoda 'true' ou 'false'");
		isDoador = scan.nextBoolean();		
		
		
		
		if(idade >= 60 && idade <= 69) { //Verifica requisito dos idosos, se é primeira doacao ou nao
			
			if(isDoador) System.out.println(nome + " nao esta apto(a) para doar sangue!\nIdosos com idade entre 60 e 69 não podem doar se for primeira doacao.");
			else System.out.println(nome + " esta apto(a) para doar sangue!");
			
		}else if(idade >= 18 && idade <= 59 ) { //Captura voluntarios que possuem idade requisitada, independente de ser primeira doacao
			System.out.println(nome + " esta apto(a) para doar sangue!");
		}else { //Pessoas que nao atendem requisitos de idade
			System.out.println(nome + " nao esta apto(a) para doar sangue!\nIdade nao atende requisitos.");
		}
		
		scan.close();

	}
	
}
