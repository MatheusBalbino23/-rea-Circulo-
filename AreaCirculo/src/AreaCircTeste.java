import java.util.Scanner;

public class AreaCircTeste {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        double raio = scanner.nextDouble();

        AreaCirc a1 = new AreaCirc(raio);

        System.out.printf("A área do círculo é: %.2f", a1.area());

        scanner.close();
    }
}