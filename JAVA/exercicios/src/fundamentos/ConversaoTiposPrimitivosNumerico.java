package fundamentos;

public class ConversaoTiposPrimitivosNumerico {
	public static void main(String[] args) {
		double a = 1;  // Conversão implícita    maior ----> menor
		
		double b = 1.12312312321;
		System.out.println(b);
		
		float c = (float) 1.12312321312;   // O valor está perdendo alguns dados
		                     // Mas como foi explícito você está ciente da possível perda
		System.out.println(c);
							// O java não comparar o valor do dado e sim o tipo de dado 
		int e = 129;
		byte d = (byte) e;     // Confia 
		System.out.println(d);
	}
}
