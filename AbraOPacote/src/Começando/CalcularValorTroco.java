package Começando;

		import java.util.Scanner;

		public class CalcularValorTroco {
		
		public static void main(String[] args) {
			
			System.out.print("Digite o valor do produto: ");
			
			Scanner scanner =new Scanner (System.in);
			Double valorProduto= scanner.nextDouble();
			
			System.out.print("Digite a quantidade passada pelo cliente: ");
			Double valorPassadoPeloCliente= scanner.nextDouble();
			
			Double resultado = valorPassadoPeloCliente - valorProduto;
			
			System.out.println("troco: "+ resultado);
			
			scanner.close();
		}  

	}


