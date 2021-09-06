package Operadores;

import java.util.Scanner;

public class calculadoraSimples {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		Double primeiroNumero = scanner.nextDouble();

		System.out.print("Digite o segundo número: ");
		Double segundoNumero = scanner.nextDouble();
		
		System.out.println("---------------------------------------------------");
		System.out.println("[1]ADIÇÃO|[2]SUBTRAÇÃO|[3]DIVISÃO|[4]MULTIPLICAÇÃO|");
		System.out.println("---------------------------------------------------");
		Integer operacao = scanner.nextInt();
		
		Double resultado = null;
		
		if (operacao.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		}
		
		if (operacao.equals(2)) {
			resultado = primeiroNumero - segundoNumero;			
		}
		
		if (operacao.equals(3)) {
			resultado = primeiroNumero / segundoNumero;			
		}
		
		if (operacao.equals(4)) {
			resultado = primeiroNumero * segundoNumero;			
		}
		
		System.out.println("Resultado: " + resultado);
		scanner.close();
		
	
			
	}

}
