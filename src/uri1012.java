import java.util.Locale;
import java.util.Scanner;

public class uri1012 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		double pi = 3.14159;
		
		double a = ler.nextDouble(); 
		double b = ler.nextDouble(); 
		double c = ler.nextDouble(); 
		
		double triangulo = (a * c) / 2.0; 
		double circulo = pi * Math.pow(c, 2);
		double trapezio = (a + b) * c / 2.0;
		double quadrado = b * b;
		double retangulo = a * b; 
		
		System.out.printf("TRIANGULO: %.3f%n",triangulo);
		System.out.printf("CIRCULO: %.3f%n",circulo);
		System.out.printf("TRAPEZIO: %.3f%n",trapezio); 
		System.out.printf("QUADRADO: %.3f%n",quadrado);  
		System.out.printf("RETANGULO: %.3f%n",retangulo);
		
		ler.close();

	}

}
