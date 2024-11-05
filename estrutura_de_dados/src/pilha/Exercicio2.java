package pilha;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
	
		int opcao;
		
		String menu = """
		1: Adicionar Livro na pilha
		2: Listar todos os Livros
		3: Retirar Livro da Pilha
		0: Sair
		Entre com a opção desejada: """;
		
		boolean continuar = true;
		
		while(continuar) {
			System.out.println(menu);
			opcao = scan.nextInt();
			
			switch(opcao) {
				case 0->continuar = false;
				case 1-> {
					scan.skip("\\R?");
					System.out.println("Digite o nome do livro: ");
					pilha.add(scan.nextLine());
					System.out.println("\nPilha: ");
					pilha.forEach(l->System.out.println(l));
					System.out.println("\nLivro adicionado!"+"\n");
				}
				case 2-> {
					if(!pilha.isEmpty()) {
						System.out.println("\nLista de livros na pilha: \n");
						pilha.forEach(l->System.out.println(l));
					}else {
						System.out.println("\nA pilha esta vazia!");
					}
				}
				case 3->{
					if(!pilha.isEmpty()) {
						System.out.println("\nUm livro foi retirado da Pilha.\nPilha:");
						pilha.pop();
						pilha.forEach(l->System.out.println(l));
					}else {
						System.out.println("\nA pilha esta vazia!");
					}
						
				}
			}
			System.out.println();
		}
		System.out.println("Programa finalizado!");
		scan.close();
	}

}
