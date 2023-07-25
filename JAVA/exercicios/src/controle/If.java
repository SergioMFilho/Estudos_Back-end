package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média:");
		double media = entrada.nextDouble();
		boolean aprovadoNaMedia = media >= 7;
		boolean recuperacao = media < 7 && media >= 5;
		boolean reprovado = media < 5;
		
		if(aprovadoNaMedia == true) {
			System.out.println("Aluno aprovado");	
		} else if (recuperacao == true) {
			System.out.println("Aluno em recuperação");
		} else {
			System.out.println("Aluno reprovado");
		}
		
//		double nota = 1.3;
//		if(nota >= 9) ;  {  nenhum código de controle tem ; no meio, existe exceção
//			System.out.println("Você é fera!!!");
//		}
//		
		entrada.close();
	}
}
