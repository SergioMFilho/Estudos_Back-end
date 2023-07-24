package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá galera".charAt(1)); // Qual a letra na posição tal
		
		String s = "Boa tarde";   // String é um objeto imultável, nuncam muda o valor inicial
		// s = s.toUpperCase();   Substituindo o valor
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));     // string começa com ...
		System.out.println(s.startsWith("boa"));
		System.out.println(s.endsWith("tarde"));	// termina com ...
		System.out.println(s.equals("Boa tarde"));    // é igual a ...
		System.out.println(s.equalsIgnoreCase("boa tarde"));  // é igual a... ignore maiúsculas e minúsculas...
		System.out.println(s.length());
		
		String nome = "Sérgio";
		String sobrenome = "Medeiros";
		int idade = 25;
		double salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + " \nidade: " + idade + "\nSalario: " + salario);
	
		// Forma simplificada do print
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f ", nome, sobrenome, idade, salario);
		// printf  ----->   %s = string    %d = inteiro   %f   %.2f = duas casas decimais
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f ", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		// Passando para um objeto string
		
		System.out.println("Frase qualquer".contains("qual"));  // contêm?
		System.out.println("Frase qualquer".indexOf("qual"));   // posição
		System.out.println("Frase qualquer".substring(6));     // a partir de
		System.out.println("Frase qualquer".substring(6,8));   // não inclui o último
		
	}
}
