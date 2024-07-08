import java.util.Locale;
import java.util.Scanner;

public class uri1038 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		double total = 0.0;
		
		int codigo = sc.nextInt(); 
		int quantidade = sc.nextInt(); 
			
		switch(codigo) { 
			case 1: 
				total = quantidade * 4.0;
				break;
			case 2: 
				total = quantidade * 4.50;
				break;
			case 3: 
				total = quantidade * 5.00;
				break;
			case 4: 
				total = quantidade * 2.00;
				break;
			case 5: 
				total = quantidade * 1.50;
				break;
		}
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
}
