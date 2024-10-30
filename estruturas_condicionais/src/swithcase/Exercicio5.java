package swithcase;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

//Com base na tabela da imagem1, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) 
//e a quantidade comprada deste item (número inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.

import java.util.Scanner;

public class Exercicio5 {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String menu = "Bem vindo a GenFood!!\n1 - FAZER PEDIDO\n0 - SAIR";
		byte opcao;
		
		do {
			System.out.println(menu);
			opcao = scan.nextByte();
			switch(opcao) {
				case 0 -> System.out.println("Saindo");
				case 1 -> fazerPedido();
				default -> System.out.println("Opcao invalida!");
			}
		}while(opcao != 0);
		
		System.out.println("Volte sempre!");
		
		scan.close();
	}
	//Metodo que cria e retorna o cardapio
	public static Map<String, Float> cardapio(){	
		
		Map<String, Float> cardapio = new LinkedHashMap<>();
		
		
		cardapio.put("Cachorro-Quente", 10.00f);
		cardapio.put("X-Salada", 15.00f);
		cardapio.put("X-Bacon", 18.00f);
		cardapio.put("Bauru", 12.00f);
		cardapio.put("Refrigerante", 8.00f);
		cardapio.put("Suco de Laranja", 13.00f);
		
		return cardapio;
	}
	public static void fazerPedido() {
		
		Map<String, Float> cardapio = cardapio(); //Carregando o cardapio. Map que associa nome do item(chave) e preco do item(valor)
		Map<String, Integer> comanda = new LinkedHashMap<>(); //Map que associa nome do pedido(chave) e a quantidade pedida(valor)
		List<String> opcoes = Arrays.asList("Cachorro-Quente","X-Salada","X-Bacon","Bauru","Refrigerante","Suco de Laranja");
		//Lista com as opcoes. Foi criada pois um Map não pode ser acessado por indice, mas como o LinkedHashMap garante a ordem de insercao, a ordem dessa lista sera a mesma que a do Map.
		
		System.out.println("Escolha um item do nosso cardapio!\n");
		
		byte item = 1;
		
		for (String key : cardapio.keySet()){	//Imprime Cardapio com opcoes
			System.out.println(item + " - " + key + " : " + cardapio.get(key));
			item++;
		};
		
		int opcao, quantidade;
		boolean pedir = true; //Variavel que controla o laço de repeticao
		
		
		while (pedir) {	//Looping para pedidos do cardapio
			
			opcao = lerInt("\nDigite o item do cardapio ou 0 para encerrar");
			
			switch(opcao) {	//Opcoes de acordo com o cardapio apresentado
				case 0 ->  pedir = false;
				case 1 -> {
					System.out.println("Item Selecionado: " + opcoes.get(0).toUpperCase());	//Exibe a opcao selecionada em maiusculo
					quantidade = lerInt("Digite a quantidade: "); //Le a quantidade desejada do item
					comanda.put(opcoes.get(opcao-1), quantidade);	//Adiciona o item e a quantidade na comanda. opcoes.get(0) é o item selecionado que esta numa lita, sera a chave utilziada no Map da comanda
				}
				case 2 -> {
					System.out.println("Item Selecionado: " + opcoes.get(1).toUpperCase());
					quantidade = lerInt("Digite a quantidade: ");
					comanda.put(opcoes.get(opcao-1), quantidade);
				}
				case 3 -> {
					System.out.println("Item Selecionado: " + opcoes.get(2).toUpperCase());
					quantidade = lerInt("Digite a quantidade: ");
					comanda.put(opcoes.get(opcao-1), quantidade);
				}
				case 4 -> {
					System.out.println("Item Selecionado: " + opcoes.get(3).toUpperCase());
					quantidade = lerInt("Digite a quantidade: ");
					comanda.put(opcoes.get(opcao-1), quantidade);
				}
				case 5 ->{
					System.out.println("Item Selecionado: " + opcoes.get(4).toUpperCase());
					quantidade = lerInt("Digite a quantidade: ");
					comanda.put(opcoes.get(opcao-1), quantidade);
				}
				case 6 ->{
					System.out.println("Item Selecionado: " + opcoes.get(5).toUpperCase());
					quantidade = lerInt("Digite a quantidade: ");
					comanda.put(opcoes.get(opcao-1), quantidade);
				} default -> System.out.println("Opcao invalida!");
			}
		}
		
		System.out.println("\n====================CONTA====================");
		float total = 0f; 
		
		for (String key : comanda.keySet()){
			System.out.println("Item: " + key + " | Qntd: " + comanda.get(key) + " | Valor: " + comanda.get(key) * cardapio.get(key)); //Exibe a comanda do cliente
			total += comanda.get(key) * cardapio.get(key); //Soma o total de todos os itens
		};
		System.out.println("=============================================");
		System.out.println("TOTAL: " + total);
		System.out.println("=============================================");	
	}

	public static int lerInt(String mensagem) {
		System.out.println(mensagem);
		return scan.nextInt();
	}
}
