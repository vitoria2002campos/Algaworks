package Variáveis;

import java.util.Scanner;

public class programaTesteAluno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
	  final Integer notaMinimaPassarDeAno = 7;
		
		System.out.println("Digite a nota do aluno: ");
		Double nota = scanner.nextDouble();
		
		Boolean passouDeAno= nota >notaMinimaPassarDeAno;
		
		if (passouDeAno) {
			System.out.println("O aluno atingiu a meta anual.");
		}else {
			System.out.println("O aluno não atingiu a meta anual.");
		}
			
		
		scanner.close();
			
	    

	}

}
