package EstruturasDeDecisao;

import java.util.Scanner;

public class calculoBonusFuncionario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a meta de faturamento para esse ano: ");
		Double meta= scanner.nextDouble();
		
		System.out.println("Digite o faturamento atual: ");
		Double faturamento= scanner.nextDouble();
		
		System.out.println("Digite a média salarial dos últimos 12 meses: ");
		Double mediaSalarial= scanner.nextDouble();
		
		Double oitentaPorCentoDaMeta = (meta*80) / 100;
		Boolean bateuAMeta= faturamento>=meta;
		Boolean FaturouPeloMenosOitentaPorCento= faturamento>=oitentaPorCentoDaMeta;
		
		if (bateuAMeta) {
			System.out.println(" O BONUS ANUAL É DE 100%!: " + mediaSalarial);
		}else if (FaturouPeloMenosOitentaPorCento) {
			Double oitentaPorCentoDaMediaSalarial= (mediaSalarial*80)/100;
			System.out.println("O BONUS ANUAL É DE 80%!: " +oitentaPorCentoDaMediaSalarial);
		}else {
			System.out.println("Esse ano não tem bonus.");
		}

		
		scanner.close();

	}

}
