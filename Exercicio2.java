/*2. Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um valor positivo, 
ou seja, o programa deverá apresentar o módulo de um número fornecido. Lembre-se de verificar se o número fornecido é 
menor que zero; sendo, multiplique-o por -1.*/

package tarefa6;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite um numero inteiro: ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println(numero * -1);
		} else {
			System.out.println(numero);
		}
		sc.close();
	}

}
