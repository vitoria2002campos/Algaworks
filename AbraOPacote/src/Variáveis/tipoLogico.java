package Vari�veis;

public class tipoLogico {
	public static void main(String[] args) {
		Boolean variavelVerdadeira= true;
		System.out.println("Vari�vel verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Vari�vel false: " + variavelFalsa);
		
		System.out.println("------------------------------------");
		
		Integer idade=17;
		
		boolean podeTirarCarteira= idade >=18;
		//System.out.println("Pode tirar carteira?" +podeTirarCarteira);
		
		if(podeTirarCarteira) {
			System.out.println("Ela pode tirar carteira");
		}else {
			System.out.println("N�o � possivel tirar carteira");
		}
		
		
	}
}
