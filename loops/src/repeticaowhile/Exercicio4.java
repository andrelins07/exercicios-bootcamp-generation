package repeticaowhile;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int idade, opcaoGenero, tipoDesenvolvedor;
		int backendCont = 0, mulherFrontendCont = 0,homemMobileCont = 0,fullstackNaoBinarioCont = 0;
        int totalColaboradores = 0;
        int totalIdade = 0;
		
		boolean continua = true;
		
		while(continua) {
			
			System.out.println("Digite a sua idade: ");
			idade = scan.nextInt();
			
			System.out.println("""
					Digite a sua identidade de Genero:
					1 - Mulher Cis
					2 - Homem Cis
					3 - Não Binário
					4 - Mulher Trans
					5 - Homem Trans
					6 - Outros
					""");
			opcaoGenero = scan.nextInt();
			
			System.out.println("""
					Informe a sua Stack:
					1 - Backend
					2 - Frontend
					3 - Mobile
					4 - FullStack
					""");
			tipoDesenvolvedor = scan.nextInt();
			
	        totalColaboradores++;
	        totalIdade += idade;
			
	        
	        switch(tipoDesenvolvedor) {
	        	case 1-> backendCont++;
	        	case 2->{
	                if (opcaoGenero == 1 || opcaoGenero == 4) {
	                	mulherFrontendCont++;
	                }
	        	}
	        	case 3->{
	                if (opcaoGenero == 2 || opcaoGenero == 5) {
	                    if (idade > 40) {
	                        homemMobileCont++;
	                    }
	                }
	        	}
	        	case 4->{
	                if (opcaoGenero == 3) {
	                    if (idade < 30) {
	                    	fullstackNaoBinarioCont++;
	                    }
	                }
	        	}
	        }
            
			scan.skip("\\R?");
			
			System.out.println("Deseja continuar ? Tecle 'S' para sim, ou 'N' para nao");
			
			continua = scan.next().equalsIgnoreCase("s");
		
		}
		float media = (float)  	totalIdade/totalColaboradores;
		
		
		System.out.printf("""
				Total de pessoas desenvolvedoras Backend: %d
				Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d
				Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d
				Total de pessoas Não Binárias desenvolvedores FullStack menores de 30 anos: %d
				O número total de pessoas que responderam à pesquisa: %d
				A média de idade das pessoas que responderam à pesquisa é: %.2f\n
				""", backendCont, mulherFrontendCont, homemMobileCont, fullstackNaoBinarioCont, totalColaboradores, media);
				
		scan.close();
	}

}
