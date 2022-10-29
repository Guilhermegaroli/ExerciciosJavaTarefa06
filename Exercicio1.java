/*1) Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.*/

package tarefa6;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor A");
		float valorA=sc.nextFloat();
		
		System.out.println("Digite o valor B");
		float valorB=sc.nextFloat();
		
		if (valorA>valorB) {
			System.out.println("A diferença entre os valores é: " + (valorA-valorB));
		} else {
            System.out.println("A diferença entre os valores é: " + (valorB-valorA));
		}
	sc.close();
	}
	

}
