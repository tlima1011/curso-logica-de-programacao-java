import java.util.Locale;
import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		int codigo1 = ler.nextInt(); 
		int numero1 = ler.nextInt(); 
		double valor1 = ler.nextDouble(); 
		
		int codigo2 = ler.nextInt(); 
		int numero2 = ler.nextInt(); 
		double valor2 = ler.nextDouble(); 
		
		double total = (numero1 * valor1) + (numero2 * valor2); 
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
		
		ler.close();

	}

}
