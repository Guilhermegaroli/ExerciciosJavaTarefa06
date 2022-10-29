/*9. Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar.*/

package tarefa6;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Digite um numero qualquer: ");

		numero = sc.nextInt();

		if (numero % 2 == 1) {

			System.out.println("O numero digitado é impar");

		} else {

			System.out.println("O numero digitado é par");

		}

		sc.close();

	}

}
