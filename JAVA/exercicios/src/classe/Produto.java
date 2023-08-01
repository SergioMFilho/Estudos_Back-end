package classe;

public class Produto {
	
	String descricao;
	double preco;
	static double desconto = 0.25;
	
	Produto(String descricaoInicial, double precoInicial) {  // constructor explícito
		 descricao = descricaoInicial;
		 preco = precoInicial;
	}
	
	Produto() {    // agora posso usar com e sem parâmetro
		
	}
	
	double aplicarDesconto() {
		double precoDescontado = preco * (1 - desconto);
		return precoDescontado;
	}
	
}
