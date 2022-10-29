/*4. Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, 
se o valor da média escolar for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota de exame, somar com o 
valor da média e obter nova média. Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi aprovado
em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar com as mensagens o valor da 
média do aluno, para qualquer condição.*/

package tarefa6;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

	   System.out.println("Digite a nota 1");
	   float nota1=sc.nextFloat();
	   
	   System.out.println("Digite a nota 2");
	   float nota2=sc.nextFloat();
	   
	   System.out.println("Digite a nota 3");
	   float nota3=sc.nextFloat();
	   
	   System.out.println("Digite a nota 4");
	   float nota4=sc.nextFloat();
	   float mediaEscolar=(nota1+nota2+nota3+nota4) /4;
	   
	   if (mediaEscolar >= 7) {
	   System.out.println("O Aluno está aprovado com a média: " + mediaEscolar); 	
	
	   } else {
	   System.out.println("O Aluno está de recuperação: " + mediaEscolar);
		
	   System.out.println("Digite o valor da prova de recuperação");
	   float notaExame=sc.nextFloat();
	   float mediaExame=(mediaEscolar+notaExame) /2;
	   
	   if (mediaExame >=5) {
		System.out.println("O Aluno foi aprovado por exame " +mediaExame);
	} else {
        System.out.println("O Aluno não foi aprovado no exame " +mediaExame);
	}
	   
	   }
	sc.close();
	
	}

}
