import java.util.Locale;
import java.util.Scanner;

public class MainExecVet7 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		String nome[] = new String[n]; 
		double n1[] = new double[n]; 
		double n2[] = new double[n]; 
		double m[] = new double[n];
		
		for(int i = 0; i < n; i++) { 
			nome[i] = sc.next(); 
			n1[i] = sc.nextDouble(); 
			n2[i] = sc.nextDouble(); 
			m[i] = (n1[i] + n2[i]) / 2.0;
		}
		
		for(int i = 0; i < n;i++) { 
			if(m[i] >= 6){
				System.out.printf("%s%n",nome[i]);
			}
		}
		sc.close();
	}
}
