package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
//		int a = 2 + 3 * 4;
//		int b = (int) Math.pow(a, 3);
		
//		System.out.println(b);
		
		double primeiraOperacao = Math.pow((6 * (3 + 2)), 2) / (3 * 2);
		double segundaOperacao = Math.pow(((1 - 5) * (2 - 7)) / 2 , 2);
		double primeiraExpressao = Math.pow((primeiraOperacao - segundaOperacao), 3);
		double segundaExpressao = Math.pow(10, 3);
		
		double resultado = primeiraExpressao / segundaExpressao;
		
		System.out.println(primeiraOperacao);
		System.out.println(primeiraExpressao);
		System.out.println(resultado);
	}
}
