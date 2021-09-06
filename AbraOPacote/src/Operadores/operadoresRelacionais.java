package Operadores;

public class operadoresRelacionais {

	public static void main(String[] args) {
		Boolean tresMaiorQueDois = 3 > 2;
		System.out.println("3 > 2? " + tresMaiorQueDois);
		
		Boolean tresMenorQueDois = 3 < 2;
		System.out.println("3 < 2? " + tresMenorQueDois);
		
		Boolean tresMaiorQueTres = 3 > 3;
		System.out.println("3 > 3? " + tresMaiorQueTres);
		
		Boolean tresMaiorOuIgualATres = 3 >= 3;
		System.out.println("3 >= 3? " + tresMaiorOuIgualATres);
		
		Boolean tresMenorOuIgualATres = 3 <= 3;
		System.out.println("3 <= 3? " + tresMenorOuIgualATres);
		
		Boolean doisIgualADois = 2 == 2;
		System.out.println("2 == 2? " + doisIgualADois);
		
		Boolean doisDiferenteDeDois = 2 != 2;
		System.out.println("2 != 2? " + doisDiferenteDeDois);
		
		Integer quatro = 4;
		Boolean quatroMaiorQueQuatro = quatro > quatro;
		System.out.println("quatro > quatro? " + quatroMaiorQueQuatro);
		
		Boolean quatroMaiorOuIgualAQuatro = quatro >= quatro;
		System.out.println("quatro >= quatro? " + quatroMaiorOuIgualAQuatro);
		
		Integer cinco = 5;
		Boolean cincoIgualACinco = cinco.equals(cinco);
		System.out.println("cinco.equals(cinco)? " + cincoIgualACinco);
		
		Integer seis = 6;
		Boolean cincoIgualASeis = cinco.equals(seis);
		System.out.println("cinco.equals(seis)? " + cincoIgualASeis);
		
		Integer centoVinteOito = 128;
		Integer centoVinteOito02 = 128;
		Boolean centoVinteOitoIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito02);
		System.out.println("centoVinteOito.equals(centoVinteOito02)? " + centoVinteOitoIgualCentoVinteOito);
	}

}
