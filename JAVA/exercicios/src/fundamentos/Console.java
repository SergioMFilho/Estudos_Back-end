package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" Dia");
		System.out.println(" Bom");
		System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("\nSalário: %.1f", 1280.8000);
		System.out.printf("\nNome: %s%n", "João");	// System.out = saída do sistema
		
		Scanner entrada = new Scanner(System.in);   // entrada no sistema System.in
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
//		Existem os tipos de entrada para cada tipo de dados, colocar o certo
		
		System.out.println("\nNome = " + nome);
		System.out.println("\nSobrenome = " + sobrenome);
		System.out.println("\nIdade = " + idade);
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		 
	    System.out.println("Qual a sua idade?");  // Se o nextInt vier primeiro temos problemas
	    int age = entrada.nextInt();
	    entrada.nextLine();
	    System.out.println("Qual o seu nome?");
	    String name = entrada.nextLine();
	    System.out.println("Qual o seu sobrenome?");
	    String sobrename = entrada.nextLine();
	 
		
		entrada.close();   // para de usar recursos da máquina
	}
}
