package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		boolean fome = !trabalho1 || !trabalho2;
		boolean comproutv32 = trabalho1 ^ trabalho2;
		boolean comproutv50 = trabalho1 && trabalho2;
				
		System.out.println("Comprou tv 32 ? " + comproutv32);
		System.out.println("Comprou tv 50 ? " + comproutv50);
		System.out.println("Está com fome ? " + fome);
		
	}
}
