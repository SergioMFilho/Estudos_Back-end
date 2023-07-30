package controle;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double maiorValor = 0;
		int contador = 0;
		
		do {
			System.out.println("Digite um numero: ");
			double valor = entrada.nextDouble();
			
			if(valor > maiorValor) {
				maiorValor = valor;
			}
			
			contador++;
		} while (contador != 5);
		
		System.out.println(maiorValor);
		entrada.close();
	}
}
