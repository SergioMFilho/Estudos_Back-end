package fundamentos;

import java.util.Date;  // Ctrl + shift + O  ----->  Organizar os imports

import javax.swing.JButton;

public class Import {
	public static void main(String[] args) {
		java.lang.String b = "Boa tarde"; // java.lang seria o caminho completo usado, mas que ja vem por padrão
		String s = "bom dia";
		Date d = new Date();    // Para usar a data precisa importar
		System.out.println(d);
		
		JButton bota = new JButton();
	}
}
