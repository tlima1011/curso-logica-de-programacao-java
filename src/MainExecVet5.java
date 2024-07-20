import java.util.Locale;
import java.util.Scanner;

public class MainExecVet5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		int vet[] = new int[n];
		int soma = 0, c = 0;
		
		for(int i = 0; i < n;i++) { 
			vet[i] = sc.nextInt();
			if(vet[i] % 2 == 0) { 
				soma += vet[i]; 
				c = c + 1; 
			}
		}
		
		double m = soma / (double) c; 
		System.out.printf("%.1f",m);
		sc.close();
	}
}
