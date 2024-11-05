package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao;
		
		String menu = """
		1: Adicionar Cliente na fila
		2: Listar todos os Clientes na fila
		3: Retirar Cliente da Fila
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
					System.out.println("Digite o nome do cliente: ");
					fila.add(scan.nextLine());
					System.out.println("\nCliente adicionado!\nFila:");
					fila.forEach(c->System.out.println(c));
				}
				case 2-> {
					if(!fila.isEmpty()) {
						System.out.println("Lista de Clientes na fila: ");
						fila.forEach(c-> System.out.println(c));
					}else {
						System.out.println("\nA Fila está vazia");
					}
				}
				case 3->{
					if(!fila.isEmpty()) {
						System.out.println("\nChamando cliente: " + fila.poll().toUpperCase());
						System.out.println("Lista de clientes na fila: ");
						fila.forEach(c-> System.out.println(c));
					}else {
						System.out.println();System.out.println("A Fila está vazia");
					}
						
				}
			}
			System.out.println();
		}
		System.out.println("Programa finalizado!");
		scan.close();
	
	}
	
	public static <T> boolean excecaoPilhaVazia(Queue<T> pilha) {
		
		
		
		return false;
	}

}
