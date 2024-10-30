programa {
	funcao inicio() {
		/*Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
			-Todos os elementos nos índices ímpares do vetor 
			-Todos os elementos do vetor que são números pares
			-A Soma de todos os elementos do vetor
			-A Média de todos os elementos do vetor, armazenada em uma variável do tipo real*/

		inteiro tamanho = 10
		inteiro vetor[10]
		
		para(inteiro i = 0; i < tamanho; i++){
			escreva("Digite o numero ", (i+1),": ")
			leia(vetor[i])
		}
		
		escreva("\nElementos nos indices ímpares: ")
		para(inteiro i = 1; i < tamanho; i = i+2){
			escreva(vetor[i], " ")
		}

		escreva("\nElementos pares no vetor: ")
		para(inteiro i = 0; i < tamanho; i++){
			se(vetor[i] % 2 == 0){
				escreva(vetor[i], " ")
			}
		}

		inteiro soma = 0
		
		escreva("\nSoma dos elementos do vetor: ")
		para(inteiro i = 0; i < tamanho; i++){
			soma = soma + vetor[i]
		}
		escreva(soma)
		
		escreva("\nMedia dos elementos do vetor: ")
		real media = soma/tamanho
		escreva(media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1031; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */