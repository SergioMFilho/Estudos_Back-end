package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
//		Informações do funcionário
		
//		Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 1_232_232_233L; // se 'ferir' o limite precisa do L
		
//		Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
//		Tipo Booleano
		boolean estaDeFerias = false;
		
//		Tipo Caractere
		char status = 'A';  // ativo
		
//		Dias da empresa
		System.out.println("Dias de empresa = " + (365 * anosDeEmpresa));
		
//		Números de viagens
		System.out.println("Número de voos = " + numeroDeVoos/2);
		
//		Pontos por real
		System.out.println("Pontos acumulados = " + pontosAcumulados / vendasAcumuladas );
		
//		Salário
		System.out.println("Funcionário: " + id + " ganha: " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	
	}
}
