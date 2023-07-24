package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia Rapaziadaaa";
//		Só assim não funciona ---->   s.replace("Bom dia", "Boa noite");
		s = s.replace("Bom dia", "Boa noite");   // trocar valor
		s = s.toLowerCase(); 
		s = s.concat("!!!");
		
		System.out.println(s);
		System.out.println("Leo ".toUpperCase());  // Mesmo sem o valor estar na variável
	
		String x = "Leo".toUpperCase();
		System.out.println(x);

		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!"); // quando o resultado do método retornar o mesmo tipo de valor pode acontecer a concatenação
		System.out.println(y);
		
//		Os tipos primitivos não possuem a funcionalidade do operador '.' 
//		Eles não possuem comportamentos e atributos associados 
//		Exemplo :      int a = 3        
//						a.   ==>  Não irá aparecer nada
	}
}
