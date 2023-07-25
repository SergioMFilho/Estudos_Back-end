package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
//		Ao comparar strings, sempre usar o equals
		
		Scanner entrada = new Scanner(System.in);
										// o nextLine não tira espaços em branco
		String s2 = entrada.next(); // o next por padrão retirar os espaços em branco
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
	}
}
