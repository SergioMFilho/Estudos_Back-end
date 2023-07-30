package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número:");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número ímpar");
		}
		
		String valorNota = JOptionPane.showInputDialog("Informe a nota:");
		int nota = Integer.parseInt(valorNota);
		
		String notaValida = nota < 0 || nota > 10 ? "Nota inválida" : "Nota válida" ;
		
		System.out.println(notaValida);
	}
}
