package EstruturasDeDecisao;

import java.util.Scanner;

public class diasDaSemana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero referente ao dia da semana: ");
		Integer diaDaSemana= scanner.nextInt();
		
		String dia;
		
		switch(diaDaSemana) {
		case 1: dia = "SegundaFeira";
			break;
		case 2: dia = "Terça-feira"; 
			break;
		case 3: dia = "Quarta-feira"; 
			break;
		case 4: dia = "Quinta-feira"; 
			break;
		case 5: dia = "Sexta-feira"; 
			break;
		case 6: dia = "Sábado"; 
			break;
		case 7: dia = "Domingo"; 
			break;
		default:dia= "Inválido";
	}
		System.out.println("O dia escolhido foi: " + dia);
		scanner.close();
}
}
