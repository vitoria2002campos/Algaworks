package Operadores;

public class introducaoOperadores {
	public static void main(String[] args) {
		Integer adicao = 1+1;
		System.out.println("Adi��o: "+adicao);
		
		Integer subtracao= 1-1;
		System.out.println("Subtra��o: "+subtracao);
		
		Integer multiplicacao= 2*2;
		System.out.println("Multiplica��o: " +multiplicacao);
		
		Integer divisao = 4/2;
		System.out.println("Divis�o: " +divisao);
		
		Integer modulo=7%4;
		System.out.println("M�dulo: " +modulo);
		
		Integer precedencia01= 1 +1 *5;
		System.out.println("Precedencia 01: " + precedencia01);
		
		Integer precedencia02=(1+1)*5;
		System.out.println("Precedencia 02: " + precedencia02);
	
		Integer precedencia03 = 5 * (1 +1);
		System.out.println("Precedencia 03: " +precedencia03);
		
		Integer precedencia04 = 5 * (1 +1) + 2;
		System.out.println("Precedencia 04: " +precedencia04);
		
		Integer precedencia05 = 5 * ((1 +1) + 2);
		System.out.println("Precedencia 05: " +precedencia05);
		
		Integer cinco = 5;
		Integer um = 1;
		
		Integer precedenciaComVariaveis = cinco * (um +um);
		System.out.println("Precedencia com variaveis: "+precedenciaComVariaveis);
		               
	} 
}
  