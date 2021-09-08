package EstruturasDeDecisao;

import java.util.Scanner;

public class testeDeConcursoPublico {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner (System.in);
		 
	
	 final Double NOTA_GERAL=150.0;
	 final Double NOTA_MINIMA=60.0;
	
	System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
	System.out.println("::::::::::::::::::::::::::::::::::::::::::::::;:::::");
	System.out.println("SISTEMA DE VERIFICAÇÃO CLASSIFICATÓRIA PARA CONCURSO");
	System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
	System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
	
	
	
	System.out.println("...........................");
	System.out.println("Digite a nota de portugues ");
	System.out.println("...........................");
	Double notaPort= scanner.nextDouble();
	System.out.println(".............................");
	System.out.println("Digite a nota de Matemática: ");
	System.out.println(".............................");
	Double notaMat= scanner.nextDouble();

	Boolean estaAcimaDoMinimoEmPortugues= notaPort>=NOTA_MINIMA;
	Boolean estaAcimaDoMinimoEmMatematica= notaMat>=NOTA_MINIMA;
	
	Double notaTotal=notaPort+notaMat;
	Boolean temNotaParaPassar= notaTotal>=NOTA_GERAL;
	
	Boolean passou = temNotaParaPassar&&
			estaAcimaDoMinimoEmPortugues&&estaAcimaDoMinimoEmMatematica;
	
	if (passou) {
		System.out.println("......................");
		System.out.println("Parabéns! Voce passou!.");
		System.out.println("......................");
	}else {
		System.out.println("...............................................");
		System.out.println("Infelizmente não foi dessa vez...tente de novo.");
		System.out.println("...............................................");
	}
	
	scanner.close();
	
	
	
	
	  
	}

}
