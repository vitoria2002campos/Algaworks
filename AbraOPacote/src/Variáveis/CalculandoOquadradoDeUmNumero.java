package Vari�veis;

import java.util.Scanner;

public class CalculandoOquadradoDeUmNumero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um valor:" );
		Integer numero= scanner.nextInt();
		
		Integer quadrado= numero*numero;
		
		System.out.println("O quadrado de " + numero  + " �  " + quadrado + ".");
		
		scanner.close();
		
		
	}

}
