import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		int NUMBER = sc.nextInt(); 
		int quantidade = sc.nextInt(); 
		double valor = sc.nextDouble(); 
		
		double SALARY = valor * quantidade;
		
		System.out.println("NUMBER = " +NUMBER);
		System.out.printf("SALARY = U$ %.2f%n",SALARY);
		
		sc.close();

	}

}
