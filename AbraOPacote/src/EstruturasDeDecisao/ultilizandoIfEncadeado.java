package EstruturasDeDecisao;

import java.util.Scanner;

public class ultilizandoIfEncadeado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
//		
		System.out.println("Digite o peso: ");
		Double peso= scanner.nextDouble();
//				
//		if(pesoLeve) {
//		System.out.println("O lutador � peso leve.");
//		}else {
//			if (pesoMedio) {
//				System.out.println("O lutador � peso m�dio.");
//			}else {
//				if (pesoPesado) {
//					System.out.println("O Lutador � peso pesado.");
//				
//			}
//			
//		}
//		}
//		
		Boolean pesoLeve = (peso<=60) && (peso>0);
		Boolean pesoMedio= (peso>60) && (peso<=90);
		Boolean pesoPesado = peso>90;
		
		if(pesoLeve) {
			System.out.println("O lutador(a) � peso leve.");
		}else if (pesoMedio) {
			System.out.println("O lutador(a) � peso m�dio.");
		}else if (pesoPesado) {
			System.out.println("O lutador(a) � peso pesado.");
		}else {
			System.out.println("O lutador(a) n�o se encaixa em nenhuma categoria");
		}
		scanner.close();

	}

}
