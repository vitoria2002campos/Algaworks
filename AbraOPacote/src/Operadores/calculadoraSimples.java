package Operadores;

import java.util.Scanner;

public class calculadoraSimples {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		Double primeiroNumero = scanner.nextDouble();

		System.out.print("Digite o segundo n�mero: ");
		Double segundoNumero = scanner.nextDouble();
		
		System.out.println("---------------------------------------------------");
		System.out.println("[1]ADI��O|[2]SUBTRA��O|[3]DIVIS�O|[4]MULTIPLICA��O|");
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
