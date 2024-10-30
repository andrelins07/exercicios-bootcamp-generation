package exercicios;

import java.util.Scanner;

/*ELABORE UM ALGORITMO EM JAVA QUE LEIA 4 NOTAS DE UM PARTICIPANTE, 
 EM VARIAVEIS DO TIPO FLOAT E EXIBA NA TELA E MEDIA FINAL DO PARTICIPATE*/

public class Exercicio2 {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float nota, soma = 0f, media;		//Declaracao de variaveis
		byte cont = 1, quantidadeNotas;
		
		System.out.print("Informe a quantidade de notas: "); //Entrada da quantidade de notas para calculo da média
		quantidadeNotas = scan.nextByte();
		
		while(cont <= quantidadeNotas) { //Looping para capturar a quantidade de notas totais, informado na linha 18	
				
			nota = lerFloat("Digite o valor da NOTA " + cont); //Leitura das notas	
			soma += nota;	//Somatorio das notas totais informadas por meio dos operadores unarios
			cont++;	//Controla a quantidade de vezes dentro do looping, nao ultrapassando a quantidade de notas informada
		}
		
		media = soma/quantidadeNotas;	//realiza a media
		
		System.out.printf("\nA media final do participante eh: %.2f", media);	//imprime a media, formatando a saida para duas casas decimais
	
	}
	
	public static float lerFloat(String mensagem) {	//Funcao que imprime a mensagem e faz leitura e retorna o valor float digitado
		
		System.out.println(mensagem);
		return scan.nextFloat();
	}
	
}
