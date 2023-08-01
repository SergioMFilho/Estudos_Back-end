package classe;

import java.util.Scanner;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		  
		int a = 3;
		Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto();   // i don´t need to import it because it's in the same package
		p1.descricao = "Notebook da marca lá";
		p1.preco = 2889.0;
		
		Produto.desconto = 0.5; // explicitamente mudando o valor do desconto
		
		System.out.println(Produto.desconto);
		
		Produto p2 = new Produto("Notebook da outra marca lá", 3000);        // Inference
		
		double precoDescontado = p1.aplicarDesconto();
		double precoDescontado2 = p2.aplicarDesconto();
		System.out.println(precoDescontado); 
		System.out.println(precoDescontado2);
	}
}
