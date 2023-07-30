package controle;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		
		
//		while(!valor.equalsIgnoreCase("sair")) {
//			System.out.println("Se for sair diga 'sair'");
//			valor = entrada.nextLine();
//		}
		
		
		do {
			System.out.println("Faça alguma coisa...");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("estou fazendo"));
		
		System.out.println("saiu");
		
		entrada.close();
	}
}
