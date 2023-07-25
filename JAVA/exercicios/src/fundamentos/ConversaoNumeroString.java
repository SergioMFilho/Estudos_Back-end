package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;    // Usando o wrapper Integer para usar o toString()
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length()); // Utilizando o wrapper
														// Diretamente no num. primitivo
		System.out.println(("" + num2).length());  // Outra forma de transformar em string
	}
}
