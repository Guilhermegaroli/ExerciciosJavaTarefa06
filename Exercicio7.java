	//7. Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.//

package tarefa6;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro numero");
		int primeiro = sc.nextInt();

		System.out.println("Digite o segundo numero");
		int segundo = sc.nextInt();

		System.out.println("Digite o terceiro numero");
		int terceiro = sc.nextInt();

		System.out.println("Digite o quarto numero");
		int quarto = sc.nextInt();

		if (primeiro % 2 == 0 || primeiro % 3 == 0) {
			System.out.println(primeiro);
		}

		if (segundo % 2 == 0 || segundo % 3 == 0) {
		}
		System.out.println(segundo);

		if (terceiro % 2 == 0 || terceiro % 3 == 0) {
		}
		System.out.println(terceiro);

		if (quarto % 2 == 0 || quarto % 3 == 0) {
		}
		System.out.println(quarto);

		sc.close();

	}

}
