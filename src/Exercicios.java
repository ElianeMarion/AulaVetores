import java.util.Scanner;

public class Exercicios {

	public static final int qtdNumeros = 10;
	public static void main(String[] args) {
		Scanner leitorNumero = new Scanner(System.in);
		
		int[] vetor = new int[qtdNumeros];
		int i;
		//Preencha um vetor com 10 números.
		for(i=0; i < vetor.length; i++) {
			System.out.println("Digite o " + (1+i) + " numero: ");
			vetor[i] = leitorNumero.nextInt();
		}

		int maior = vetor[0];
		//Exiba o maior valor
		for(i=0; i<vetor.length;i++) {
			if(vetor[i] > maior)
				maior = vetor[i];		
		}
		System.out.println("O maior valor do vetor e: " + maior);
		
		int soma = 0;
		double media;
		//Some os elementos do vetor.
		for(i=0; i<vetor.length;i++) {
			soma += vetor[i]; // soma = soma + vetor[i]
		}
		//Exiba a média dos elementos inseridos.
		media = (double) soma / vetor.length;
		System.out.println("A soma dos valores do vetor e: " + soma
							+ "\nA media: " + media);
		
		//Exiba o índice do primeiro positivo inserido.
		for(i=0; i<vetor.length;i++) {
			if(vetor[i] >= 0) {
				System.out.println("Indice do primeiro positivo: " + i);
				break;
			}	
		}
		int negativo=-1;
		//Exiba o índice do último negativo.
		for(i	=0; i<vetor.length; i++) {
			if(vetor[i] < 0) {
				negativo = i;
			}
		}
		
		if(negativo == -1)
			System.out.println("Nao encontrou nenhum valor neagivo no vetor");
		else
			System.out.println("O indice do ultimo negativo" + negativo);
		
	}

}
