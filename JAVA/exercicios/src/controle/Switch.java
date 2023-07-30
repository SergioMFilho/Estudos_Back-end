package controle;

public class Switch {

	public static void main(String[] args) {
//		String faixa = "azul";

//		switch (faixa.toLowerCase()) {
//		case "preta":
//			System.out.println("Faixa pretaaaaaaa");
//		case "cinza":
//			System.out.println("Para na cinzzzaaaaaaaaaaaa");
//		case "azul":
//			System.out.println("Faixa Azulllllllllllll");
//		default:
//			System.out.println("Entrou em nenhum dos cases");
//		}
		
		String conceito = "";
		int nota = -1;
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7: case 6:
			conceito = "B";
			break;
		case 5: case 4: case 3: case 2: case 1 :
			conceito = "C";
			break;
		default: 
			conceito = "Conceito não informado";
		}
		
		System.out.println("Conceito da Nota "+ nota + " é :\n" + conceito);
	}

}
