
public class AreaCirc {

	double raio;
	static final double pi = 3.14;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return pi * raio * raio;
	}
	
	static double area(double raio) {
		return pi * Math.pow(raio, 2);
	}
}
