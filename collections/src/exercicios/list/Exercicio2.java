package exercicios.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	
		System.out.println("""
				Seja bem vindo!! Vamos testar sua sorte hoje. Selecione abaixo a opcao desejada.
				1 - Verificar se o numero esta na lista
				2 - Advinhar a posicao do numero na lista
				""");
		int opcao = scan.nextInt();
		
		switch(opcao) {
			case 1-> localizarNumero();
			case 2-> advinharPosicao();
			default -> System.out.println("Opcao invalida!");
		}

	}
	/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da
	Classe Wrapper Integer, inicializada com 10 valores inteiros. O programa deverá
	solicitar ao usuário, que ele digite via teclado um número inteiro e caso ele seja
	encontrado no ArrayList, exiba na tela a posição deste número na Collection. Caso o
	número não seja encontrado, ele deverá exibir na tela a mensagem: O número N não
	foi encontrado!*/
	
	public static void localizarNumero() {
		
		List<Integer> lista = new ArrayList<>(Arrays.asList(2,5,1,3,4,9,7,8,10)); //Iniciando lista com valores pre-definidos
		//Collections.addAll(lista,2,5,1,3,4,9,7,8,10); //Outra forma de inicializar a lista com valores pre-definidos
		
		
		System.out.println("Digite o numero que deseja encontrar: ");
		int numero = scan.nextInt();
		
		if(lista.contains(numero)) {
			System.out.printf("O numero %d esta localizado na posicao %d\n", numero, lista.indexOf(numero));
		}else {
			System.out.printf("O numero %d nao foi localizado\n", numero);
		}
		
	}
	//Esse metodo implementa um jogo de advinhacao. Há uma lista com numeros de 1 a 10, que sao embaralhados. 
	//É gerado nesse intervalo um numero aleatorio, e o usario deve advinhar em qual posicao da lista o numero esta localizado
	public static void advinharPosicao() {
		
		ArrayList<Integer> lista = new ArrayList<>();	//
		Random gerador = new Random();
		
		for (int i = 1; i <= 10; i++) {
			lista.add(i);	//Adicioando numeros de 1 a 10
		}
		
		Collections.shuffle(lista);	//Embaralhando numeros da lista
		
		int numeroAleatorio = gerador.nextInt(10) + 1;	//Gerando o numero aleatorio no intervalo de 1 a 10, cuja posicao devera ser advinhada
		
		System.out.printf("Você terá 3 tentativas para advinhar a posicao correta do 'NUMERO %d'.\nEle pode estar em qualquer posicao entre 0 a 9\n", numeroAleatorio);
		
		int cont = 1;	//Contador para o while
		
		while(cont <= 3) {	//Criterio de parda
			
			System.out.printf("\nDigite o seu palpite %d: ", cont);
			int palpite = scan.nextInt();	//Palpite do usuario sobre a posicao do numero na lista

			if(lista.indexOf(numeroAleatorio) == palpite) {	//Caso o paplpite seja correto, é informado a mensagem de parabens, o numero e a posicao dele na lista
				System.out.printf("\nParabens, voce acertou!! O numero %d esta localizado na posicao %d\n", numeroAleatorio, palpite);
				break;
			}else { 
				if(cont != 3) //Caso tenha errado mas ainda tem tentativas, ou seja, cont != 3
					System.out.printf("Ihhhh, está errado. Mas não se preocupe, você ainda tem %d tentativa(s)\n", (3-cont));
				else //Caso tenha errado em todas as tentativas. O numero e a posicao correta são informadas para o usuario
					System.out.printf("\nNão foi dessa vez.. O numero %d esta localizdo na posicao %d\n", numeroAleatorio, lista.indexOf(numeroAleatorio));
			}
			cont++;
		}
		System.out.println("\n"+lista);
		
	}
}
