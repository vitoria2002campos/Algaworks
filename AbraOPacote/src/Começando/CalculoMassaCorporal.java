package Come�ando;
import java.util.Scanner;

public class CalculoMassaCorporal {
	
	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("-------------------------------------");
			System.out.println("-------------------------------------");
			System.out.println("C�LCULO DO �NDICE DE MASSA CORPORAL" );
			System.out.println("-------------------------------------");
			System.out.println("-------------------------------------");
			
			System.out.print("Digite seu peso: " );
			Double peso =scanner.nextDouble();
			System.out.println("-------------------------------------");
			System.out.print("Digite sua altura: " );
			Double altura = scanner.nextDouble();
			System.out.println("-------------------------------------");
			Double alturaAoQuadrado= altura*altura;
			Double indiceMassaCorporal=peso/alturaAoQuadrado;
			System.out.println("-------------------------------------");
			System.out.println("Seu indice de massa corporal � " +indiceMassaCorporal);
			scanner.close();
		}

	}


