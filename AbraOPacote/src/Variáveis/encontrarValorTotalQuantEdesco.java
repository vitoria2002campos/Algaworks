package Variáveis;

import java.util.Scanner;

public class encontrarValorTotalQuantEdesco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("TABELA DE PRODUTOS DA PAPELARIA BEM TE VI");
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		System.out.println("Estojo R$20,0\r\n");
		System.out.println("-----------------------------------------");
		
		System.out.print("Digite o valor de um produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade: ");
		Integer quantidade = scanner.nextInt();
		
		Double valorSubtotal = valorProduto * quantidade;
		
		Boolean quantidadeMaiorOuIgualDez = quantidade >= 10;
		
		Double percentualDesconto = 0.0;
		
		if (quantidadeMaiorOuIgualDez) {
			percentualDesconto = 10.0;
		}
		
		Double desconto = valorSubtotal * percentualDesconto / 100;
		
		Double valorTotalComDesconto = valorSubtotal - desconto;
		
		System.out.println("Valor total: " + valorTotalComDesconto);
				
		scanner.close();

	}

}
