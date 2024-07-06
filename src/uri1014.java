import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		int x = ler.nextInt();
		double y = ler.nextDouble(); 
		
		double consumo = x / y; 
		System.out.printf("%.3f km/l%n", consumo);
		
		ler.close();

	}

}
