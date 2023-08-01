package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(5.6);
//		a1.raio = 10
		AreaCirc a2 = new AreaCirc(5.6);
//		a2.pi = 1;

		System.out.println(a1.area());
		System.out.println(a2.area());
		
		AreaCirc.area(3.14);
	}
}
