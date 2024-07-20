import java.util.Locale;
import java.util.Scanner;

public class MainExecVet4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		double nums[] = new double[n]; 
		double s = 0.0 , m = 0.0;
		
		for(int i = 0; i < n;i++) { 
			nums[i] = sc.nextDouble();
			s += nums[i]; 
		}
		
		m = s / (double) n;
		System.out.printf("%.3f", m);
		
		System.out.println();
		for(double ns : nums) { 
			if(ns < m) { 
				System.out.printf("%.1f%n",ns);
			}
			//System.out.printf(ns < m ? String.format("%.1f%n", ns): ""); Forma alternativa operador ternário 
		}
		sc.close();
	}
}
