package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		
		System.out.print("Primeiro salário:");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.print("Segundo salário:");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.print("Terceiro salário:");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.printf("A média dos salários é %.1f" ,media);
		
		entrada.close();
	}
}
