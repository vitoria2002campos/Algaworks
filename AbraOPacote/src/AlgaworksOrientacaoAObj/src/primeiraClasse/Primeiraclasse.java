package primeiraClasse;

public class Primeiraclasse {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.nome = "Smartphone";
		produto.precoUnitario= 9000.0;
		produto.quantidade= 10;
		
		exibirQuantidadeEmEstoque(produto);
		

	}
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("Quantidade em estoque: " + produto.nome + "é de" + produto.quantidade);
	}
}
