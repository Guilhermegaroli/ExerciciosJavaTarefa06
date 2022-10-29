/*5. Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo da equação completa de segundo grau, 
 * apresentando as duas raízes, se para os valores informados for possível efetuar o referido cálculo. Lembre-se de que a 
 * variável A deve ser diferente de zero.*/

package tarefa6;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor A");
		float valorA = sc.nextFloat();

		System.out.println("Digite o valor B");
		float valorB = sc.nextFloat();

		System.out.println("Digite o valor C");
		float valorC = sc.nextFloat();

		float delta = (float) Math.pow(valorB, 2) - 4 * valorB * valorC;
		System.out.println(delta);

		if (delta > 0) {
			System.out.println("Delta > 0, exitem 2 raizes reais ");
			float x1 = (-(valorB) + (float) Math.sqrt(delta)) / 2 * valorA;
			float x2 = (-(valorB) + (float) Math.sqrt(delta)) / 2 * valorA;
			System.out.println("x1: " + x1 + "," + "x2:" + x2);

		} else if (delta == 0) {
			System.out.println("Delta = 0, portanto uma raiz");

		} else {
			System.out.println("não a raizes reais");

		}

		sc.close();

	}

}
