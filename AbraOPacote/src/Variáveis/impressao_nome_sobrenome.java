package Variáveis;

import java.util.Scanner;

public class impressao_nome_sobrenome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Seu nome é " +nome+ " "+ sobrenome);
		
		scanner.close();
		

	}

}
