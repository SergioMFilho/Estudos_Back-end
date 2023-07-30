package controle;

import java.util.Iterator;
import java.util.Scanner;

public class DesafioLetraPorLetra {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva uma palavra:");
		String palavra = entrada.nextLine();
		
		for(int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		entrada.close();
	}
}
