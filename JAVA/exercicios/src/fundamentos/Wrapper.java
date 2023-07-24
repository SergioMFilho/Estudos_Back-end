package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		// Um conjunto de classes que permitem converter tipos primitivos em objetos e vice-versa
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("1000");
		Long l = 100000L;   // precisa do L para dizer que é long
		
		System.out.println(b.byteValue());  // Transformando em byte
		System.out.println(s.toString());  // Transformando em string
		System.out.println(i);
		
		String bo = "true";
		System.out.println(Boolean.parseBoolean(bo));
		
		Character c = '#';
		c.toString();
		
		Float f = 122.33F;  // Precisa do F para dizer que é float
		
		Double d = 202.23;
	}
}
