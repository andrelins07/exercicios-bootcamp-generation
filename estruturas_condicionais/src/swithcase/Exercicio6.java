package swithcase;

import java.util.Scanner;

public class Exercicio6 {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome, cargo = null;
		int codigo;
		float salario;
		
		System.out.println("Digite seu nome: ");
		nome = scan.nextLine();
		System.out.println("Digite o codigo do seu cargo: ");
		codigo = scan.nextInt();
		System.out.println("Digite o seu salario: ");
		salario = scan.nextFloat();
		
		switch(codigo) {
			case 1 -> {
				salario *= 1.10;
				cargo = "Gerente"; //Busca o nome do cargo a partir do codigo informado
			}
			case 2 -> {
				salario *= 1.07;
				cargo = "Vendedor";
			}
			case 3 -> {
				salario *= 1.09;
				cargo = "Supervisor";
			}
			case 4 -> {
				salario *= 1.06;
				cargo = "Motorista";
			}
			case 5 -> {
				salario *= 1.05;
				cargo = "Estoquista";
			}
			case 6 -> {
				salario *= 1.08;
				cargo = "Tecnico em TI";
			}
			default -> System.out.println("Codigo informado nao existe!");
		}

		System.out.printf("""
				\nNome do colaborador: %s
				Cargo: %s
				Salario: %.2f
				""", nome, cargo, salario);
		
		scan.close();
	}
}
