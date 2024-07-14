import java.util.Locale;
import java.util.Scanner;

public class uri1154 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		double m = 0.0, s = 0.0;  
		int idade = 0, c = 0; 
		
		while(idade >= 0) { 
			idade = sc.nextInt();
			if(idade >= 0) {
				s += idade; 
				c++; 
			}
			else {
				break;
			}
		}
		
		m = s / (double) c; 
		System.out.printf("%.2f%n",m);
		
		sc.close();

	}

}
