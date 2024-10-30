programa {
	
	funcao inicio() {
	
		/*Dado um vetor contendo 10 números inteiros não ordenados, 
		 construa um algoritmo que consiga ordenar o vetor em ordem decrescente, como mostra o exemplo abaixo:
		 ENTRADA: 2 5 1 3 4 9 7 8 10 6
		 SAÍDA: 10 9 8 7 6 5 4 3 2 1 */

		inteiro vetor[10], auxiliar
		
		para(inteiro i = 0; i < 10; i++){
			escreva("Digite o numero ", (i+1),": ")
			leia(vetor[i])
		}
		para (inteiro i = 1; i < 10; i++) {
		    para (inteiro j = 0; j < i; j++) {
		        se (vetor[i] > vetor[j]) {
		            auxiliar = vetor[i]
		            vetor[i] = vetor[j]
		            vetor[j] = auxiliar
		        }
		    }
		}
		escreva("\nSAIDA: ")
		para(inteiro i = 0; i < 10; i++){
			escreva(vetor[i], " ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 645; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */