/*11. Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua
apresentação, caso o valor não seja maior que três.*/

package tarefa6;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um Valor: ");

		int valor01 = sc.nextInt();

		if (valor01 < 3) {

			System.out.println("Valor digitado: " + valor01);
			
		}
		else System.out.println("O Valor digitado é maior que 3");

		sc.close();

	}

}
