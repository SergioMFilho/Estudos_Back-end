package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				quantidadeDeNotas++;
				total += nota;				
			} else {
				System.out.println("Nota inválida, digite novamente.");
			}
		}
		
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		
	}

}
