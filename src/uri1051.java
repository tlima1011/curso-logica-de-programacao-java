import java.util.Locale;
import java.util.Scanner;

public class uri1051 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		float salario = ler.nextFloat(); 
		float ir = 0f; 
		
		if(salario >= 0f && salario <= 2000f) {
			System.out.println("Isento");
			System.exit(0); 
		}
		else if(salario <= 3000.00f) { 
			ir = (1000 * 0.08f) + 2.0f;
		}
		else if(salario <= 4500.00f) {
			ir = (1000 * 0.18f) + 2.0f;
		}
		else if(salario > 4500.00) { 
			ir = (1000 * 0.25f) + 2.0f;
		}	
		
		System.out.printf("R$ %.2f%n", ir);
		ler.close();
	}
}
