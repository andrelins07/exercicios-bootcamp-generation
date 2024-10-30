//Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características 
//de um tipo de animal possível segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.

package ifelse;

import java.util.Scanner;

public class Exercicio4 {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String caracteristica;
		
		
		caracteristica = lerString("Digite a primeira caracteristica: \nVertebrado | Invertebrado\n");
		
		if(caracteristica.equals("VERTEBRADO")) {
			
			caracteristica = lerString("Digite a segunda caracteristica: \nAve | Mamifero\n ");
			
			if(caracteristica.equals("AVE")) {
				
				caracteristica = lerString("Digite a terceira caracteristica: \nCarnivoro | Onivoro\n ");
				
				if(caracteristica.equals("CARNIVORO")) System.out.println("Aguia");
				else if(caracteristica.equals("ONIVORO")) System.out.println("Pomba");
				else System.out.println("Caracteristica nao identificada");
				
			}else if(caracteristica.equals("MAMIFERO")) {
				
				caracteristica = lerString("Digite a terceira caracteristica: \nOnivoro | Herbivoro\n");
				
				if(caracteristica.equals("ONIVORO")) System.out.println("Homem");
				else if(caracteristica.equals("HERBIVORO")) System.out.println("Vaca");
				else System.out.println("Caracteristica nao identificada");
			}
			else System.out.println("Caracteristica nao identificada");
		
		}else if(caracteristica.equals("INVERTEBRADO")){
			
			caracteristica = lerString("Digite a segunda caracteristica: \nInseto | Anelideo\n");
			
			if(caracteristica.equals("INSETO")) {
				
				caracteristica = lerString("Digite a terceira caracteristica: \nHematofago | Herbivoro\n");
				
				if(caracteristica.equals("HEMATOFAGO")) System.out.println("Pulga");
				else if(caracteristica.equals("HERBIVORO")) System.out.println("Lagarta");
				else System.out.println("Caracteristica nao identificada");
				
			}else if(caracteristica.equals("ANELIDEO")) {
				
				caracteristica = lerString("Digite a terceira caracteristica: \nHematofago | Onivoro\n");
				
				if(caracteristica.equals("HEMATOFAGO")) System.out.println("Sanguessuga");
				else if(caracteristica.equals("ONIVORO")) System.out.println("Minhoca");
				else System.out.println("Caracteristica nao identificada");
			}
			else System.out.println("Caracteristica nao identificada");
		}
		else System.out.println("Caracteristica nao identificada");

	}
	
	public static String lerString(String mensagem) {	
		System.out.println(mensagem);
		return scan.nextLine().toUpperCase();
	}

}
