package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 4;
		String resultadoParcial = media <= 3 ? "Aluno reprovado" : "Aluno em recuperação";
		String resultado = media >= 7 ? "Estou na média" : resultadoParcial;
		boolean bomComportamento = true;
		boolean alunoExemplar = media >= 7 && bomComportamento == true; 
		System.out.println(resultado);
		
		
	}
}
