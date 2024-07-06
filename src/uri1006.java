import java.util.Locale;
import java.util.Scanner;

public class uri1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		double n1 = ler.nextDouble(); 
		double n2 = ler.nextDouble();
		double n3 = ler.nextDouble(); 
		
		double media = (2 * n1 + 3 * n2 + 5 * n3)/10.0;
		System.out.printf("MEDIA = %.1f%n",media);
		
		ler.close();

	}

}
