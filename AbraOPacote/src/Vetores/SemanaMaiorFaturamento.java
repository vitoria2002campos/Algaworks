package Vetores;

public class SemanaMaiorFaturamento {

	public static void main(String[] args) {
		Double[] semanaUm = new Double [] {1500.0, 2000.0, 1700.0};
		Double[] semanaDois = new Double[] {1000.0, 2500.0, 1800.0};
		
		Double[][]faturamentoMensal= new Double[][] {semanaUm, semanaDois};
		
		for(int i=0; i <faturamentoMensal.length; i++) {
			System.out.println("Semana: " +(i+1));
			
			Double []semana=faturamentoMensal[i];
			for(int y =0; y <semana.length; y++) {
				Double dia=semana[y];
				
				System.out.println("dia " + (y +1) + ":" + dia);
			}
		}

	}

}
