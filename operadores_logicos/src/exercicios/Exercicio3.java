package exercicios;

import java.util.Scanner;

/*Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno, 
 as Horas Extras e os Descontos de um Colaborador, em variáveis do tipo float e exiba na tela o Salário Líquido.*/
public class Exercicio3 {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		float salarioBruto, salarioLiquido, adicionalNoturno, horasExtras, descontos;
	
		salarioBruto = lerFloat("Informe o salario bruto: ");
		
		adicionalNoturno = lerFloat("Informe o adicional noturno: ");
		
		horasExtras = lerFloat("Informe as horas extras: ");
		
		descontos = lerFloat("Informe os descontos");
		
		salarioLiquido = salarioBruto + adicionalNoturno + (5 * horasExtras) - descontos;
		
		System.out.printf("O salario liquido eh: %.2f", salarioLiquido);
		
		scan.close();

	}
	public static float lerFloat(String mensagem) {	//Funcao que imprime a mensagem e faz leitura e retorna o valor float digitado
		
		System.out.println(mensagem);
		return scan.nextFloat();
	}

}
