package Vari�veis;

import java.util.Scanner;

public class calculoGastoFamiliar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		Double total=0.0;
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-SISTEMA DE CALCULO MENSAL DE GASTOS-");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		System.out.println("Insira o valor da conta de luz: ");
		total+=  scanner.nextDouble();
		System.out.println("-------------------------------------");
		
		System.out.println("Insira o valor da conta de �gua: ");
		total+=  scanner.nextDouble();
		System.out.println("-------------------------------------");
		
		System.out.println("Insira o valor de telefone: ");
		total+=  scanner.nextDouble();
		System.out.println("-------------------------------------");
		
		System.out.println("Insira o valor da escola do filho: ");
		total+=  scanner.nextDouble();
		System.out.println("-------------------------------------");
		
		System.out.println("Insira o valor da fatura do cart�o: ");
		total+=  scanner.nextDouble();
		System.out.println("-------------------------------------");
		
		System.out.println("Insira o valor dos gastos com supermercado: ");
		total+=  scanner.nextDouble();
		System.out.println("-------------------------------------");
		
		System.out.println("O gasto total foi de: "+total);
		scanner.close();
	}
	
}
