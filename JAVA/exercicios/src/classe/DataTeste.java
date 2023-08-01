package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data(12, 10, 2023);
//		data1.dia = 12;
//		data1.mes = 10;
//		data1.ano = 2023;
//		
		String data1Formatada = data1.obterDataFormatada();
		
		Data data2 = new Data();
		
		String data2Formatada = data2.obterDataFormatada();
		
		System.out.println(data1Formatada);
		System.out.println(data2Formatada);
		
	}
}
