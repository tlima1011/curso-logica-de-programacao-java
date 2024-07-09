import java.util.Locale;
import java.util.Scanner;

public class uri1043 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
	
		String calculo = "";
		double calcular = 0.0;
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if((a + b > c) && (a + c > b) && (b + c > a)) { 
			calculo = "Perimetro";
			calcular = a + b + c;  
		}else {
			calculo = "Area";
			calcular = (a + b) * c / 2.0;
		}
		
		System.out.printf("%s = %.1f%n", calculo, calcular); 
		sc.close();
	}

}
