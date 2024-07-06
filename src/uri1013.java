import java.util.Locale;
import java.util.Scanner;

public class uri1013 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		int x = ler.nextInt(); 
		int y = ler.nextInt(); 
		int z = ler.nextInt(); 
		
		int k = (x + y + Math.abs(x - y)) / 2;
		int t = (k + z + Math.abs(k - z)) / 2; 
		
		System.out.printf("%d eh o maior%n", t);
		
		ler.close();

	}

}
