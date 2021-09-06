package Variáveis;

public class operadoresLogicos {
	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100= false;
		Boolean periodoDePromocao= true;
		
		//Boolean aplicarDesconto= carrinhoMaiorQue100&& periodoDePromocao;
		
//		if (aplicarDesconto) {
//			System.out.println("Sim! Aplique o desconto.");
//		}else {
//			System.out.println("Não aplique o desconto.");
//		}
	
		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto.");
		}else {
		System.out.println("Não aplique o desconto.");
		}
    }
}
