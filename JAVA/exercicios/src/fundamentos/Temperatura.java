package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
//	°C = (°F - 32) * 5/
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32; // final por ser constante
		
		double fahrenheit = 200;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Temperatura em celsius = " + celsius + "ºC");
		
		celsius = 100;
		
	}
}
