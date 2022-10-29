//8. Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.//

package tarefa6;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");

		int numero1 = sc.nextInt();

		System.out.print("Digite o segundo valor: ");

		int numero2 = sc.nextInt();

		System.out.print("Digite o terceiro valor: ");

		int numero3 = sc.nextInt();

		System.out.print("Digite o quarto valor: ");

		int numero4 = sc.nextInt();

		System.out.print("Digite o quinto valor: ");

		int numero5 = sc.nextInt();

		if (numero1 % 2 == 0 || numero1 % 3 == 0) {

			System.out.println(numero1);

		}

		if (numero2 % 2 == 0 || numero2 % 3 == 0) {

			System.out.println(numero2);

		}

		if (numero3 % 2 == 0 || numero3 % 3 == 0) {

			System.out.println(numero3);

		}

		if (numero4 % 2 == 0 || numero4 % 3 == 0) {

			System.out.println(numero4);

		}

		if (numero5 % 2 == 0 || numero5 % 3 == 0) {
			
			System.out.println(numero5);

		}

		sc.close();

	}

}
