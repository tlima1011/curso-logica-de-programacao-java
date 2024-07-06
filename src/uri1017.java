import java.util.Locale;
import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);  
		
		int horas = sc.nextInt(); 
		int velocidadeMedia = sc.nextInt(); 
		
		double distancia = (horas * velocidadeMedia) / 12.0; 
		System.out.printf("%.3f%n", distancia);
	
		sc.close();

	}

}
