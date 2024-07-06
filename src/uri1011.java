import java.util.Locale;
import java.util.Scanner;

public class uri1011 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		double pi = 3.14159;
		double r = ler.nextDouble(); 
		
		double v = (4/3.0) * pi * Math.pow(r,3); 
		
		System.out.printf("VOLUME = %.3f%n", v);
		
		ler.close();

	}
}
