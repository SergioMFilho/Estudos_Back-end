package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		// Os tipos primitivos só carregam os valores
		String s = "texto";  // String é uma classe e 's' um objeto
		s.toUpperCase(); // Quando vc cria um objeto vc possui atributos e comportamentos
		
//		Wrappers --> são a versão objeto dos tipos primitivos!
		int a = 123;
		System.out.println(a);
	}
	
		
	
}
