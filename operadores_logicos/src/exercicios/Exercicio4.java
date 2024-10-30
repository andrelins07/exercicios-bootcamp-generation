package exercicios;

import java.util.Scanner;

/*Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule e mostre a diferença 
 do produto entre o n1 e n2 pelo produto entre o n3 e o n4*/

public class Exercicio4 {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		float[] numeros = new float[4];
		float diferenca;	
		byte cont = 0;
		
		while(cont < 4) { 		
			numeros[cont] = lerFloat("Digite o NUMERO " + (cont+1));
			cont++;	
		}
		
		diferenca = (numeros[0] * numeros[1]) - (numeros[2]*numeros[3]);
		System.out.printf("A diferenca eh %.2f", diferenca);
		
		scan.close();
		
	}
	public static float lerFloat(String mensagem) {	//Funcao que imprime a mensagem e faz leitura e retorna o valor float digitado
		System.out.println(mensagem);
		return scan.nextFloat();
	}

}
