package Variáveis;

import java.util.Scanner;

public class verificacaoDeAposentadoria {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		final Integer IDADE_MINIMA_PARA_APOSENTAR=55;
		final Integer TEMPO_MINIMO_DE_CONTRIBUICAO=25;
		
		System.out.println("Digite sua idade: ");
		Integer idade= scanner.nextInt();
		
		System.out.println("Digite o tempo de contribuição com a previdencia: ");
		Integer tempo= scanner.nextInt();
		
		Boolean temIdadeParaAposentar = idade>= IDADE_MINIMA_PARA_APOSENTAR;
		Boolean temTempoDeContribuicao= tempo>= TEMPO_MINIMO_DE_CONTRIBUICAO;
		
		Boolean podeAposentar= temIdadeParaAposentar&&temTempoDeContribuicao;
		
		if(podeAposentar){
			System.out.println("VOCE PODE SE APOSENTAR!.");
		}else {
			System.out.println("VOCE NÃO PODE SE APOSENTAR NO MOMENTO!.");
		}
	
		scanner.close();
		
	}

}
