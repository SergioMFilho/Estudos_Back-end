package controle;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if( i % 2 == 0) {
				continue;   // continue interrompe apenas a uma repetição
			}
			
			if(i == 5) continue;
			
			System.out.println(i);
		}
	}
}
