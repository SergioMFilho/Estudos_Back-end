package fundamentos;

public class Operadores {
	public static void main(String[] args) {
//		Unário , binário e ternário
		/*
		 *  Unário ----> a++
		 *  Binário ----> 2 + 3 , 3 * 3, 3/3
		 *  Ternário -----> v ? a : b
		 *  
		 * Aritméticos
		 * Relacionais
		 * Lógicos
		 * Atribuição
		 * */
		var x = 34.56;
		double y = 2.23;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / (double) b);
		
		System.out.println(a % b);
		
		
	}
}
