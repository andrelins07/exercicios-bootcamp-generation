package exercicios.matrizes;

import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Random gerador = new Random();
		float[][] matriz = new float[10][4]; 
		float[] medias = new float[10];
		


		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = gerador.nextFloat(10); //Inserindo elementos na matriz de forma randomica
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Notas do Aluno %d:  ", i+1);	
			float soma = 0;
			for (int j = 0; j < 4; j++) {
				System.out.printf("%.2f  ", matriz[i][j]);//Imprime notas do aluno
				soma += matriz[i][j]; //Soma as notas do aluno
			}
			medias[i] = soma/4; //Calcula a media do aluno e insere no vetor media
			System.out.printf("\n");
		}
		
		System.out.println("""
				\nTabela de Conceitos:
				----------------------
				A - (8,5 - 10,0)
				B - (7,0 - 8,4)
				C - (5,0 - 6,9)
				D - (4,0 - 4,9)
				F - (< 4)
				-----------------------
				""");
		int cont = 0;
		//Imprime media dos alunos
		System.out.println();
		for (int i = 0; i < medias.length; i++) {	
			System.out.printf("Media Aluno %d: %.2f ----> %s\n",(i+1),medias[i],defineConceito(medias[i]));
			if(medias[i] < 5)
				cont++;
		}
		if(cont > 5) {
			System.out.println("\n" + cont*10 + "% da turma teve rendimento baixo. Com certeza foi CALCULO 1!!!!");
		}
		
		
	}
	
	public static String defineConceito(float media) {	//Funcao que define conceito do aluno a partir de sua media
		
		if(media >= 8.5) {
			return "A - Aprovado";
		}else if(media >= 7) {
			return "B - Aprovado";
		}else if(media >= 5) {
			return "C - Aprovado";
		}else if(media >= 4) {
			return "D (Aprovado com nota minima)";
		}else {
			return "F (Reprovado. Deve fazer recuperação)";
		}
		
	}
}
