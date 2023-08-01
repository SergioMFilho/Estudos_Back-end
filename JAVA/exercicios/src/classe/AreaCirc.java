package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.14;    
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}

//static quer dizer que não pertence mais a instância
// e sim a classe