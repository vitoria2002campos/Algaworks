package Variáveis;

import java.util.Scanner;

public class descontoDeFrete {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Boolean cobrarFrete= valorProduto<100;
		Double valorFinal= valorProduto;
		
		if (cobrarFrete) {
			valorFinal+=15.0;
		}
		
		System.out.println("VALOR TOTAL: "+valorFinal);
		scanner.close();
	}

}
