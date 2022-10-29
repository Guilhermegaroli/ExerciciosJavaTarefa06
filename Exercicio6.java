/*6. Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente.*/

package tarefa6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de a número");
		int a = sc.nextInt();
		System.out.println("Digite o valor de b número");
		int b = sc.nextInt();
		System.out.println("Digite o valor de c número");
		int c = sc.nextInt();

		if (a > b && a > c && b > c) {
			System.out.println(c + ", " + b + ", " + a);
		} else if (b > a && b > c && c > a) {
			System.out.println(a + ", " + c + ", " + b);
		} else if (c > a && c > b && b > a) {
			System.out.println(a + ", " + b + ", " + c);
		} else if (b > a && b > c && a > c) {
			System.out.println(c + ", " + a + ", " + b);
		} else if (c > a && c > b && a > b) {
			System.out.println(b + ", " + a + ", " + c);
		} else {
			System.out.println(b + ", " + c + ", " + a);
		}

		sc.close();

	}

}
