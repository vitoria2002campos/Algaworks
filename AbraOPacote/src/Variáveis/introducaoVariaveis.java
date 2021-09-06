package Variáveis;

import java.util.Scanner;

public class introducaoVariaveis {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto=scanner.nextDouble();
		System.out.println("Valor do produto: " +valorProduto);
		
		Double valorProdutoComFrete = valorProduto+ 2;
		
		System.out.println("Valor do produto com frete: " +valorProdutoComFrete);
		
		scanner.close();
		
	}

}
