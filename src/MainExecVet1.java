import java.util.Locale;
import java.util.Scanner;

public class MainExecVet1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		double nums[] = new double[n];  
				
		for(int i = 0; i < n;i++) { 
			nums[i] = sc.nextDouble();
		}
		
		double numeroMaior = nums[0];
		int indiceMaior = 0;
		
		for(int i = 0; i < nums.length; i++) { 
			if(nums[i] > numeroMaior) {
				numeroMaior = nums[i];
				indiceMaior = i; 
			}
		}
		
		System.out.printf("%.1f%n",numeroMaior); 
		System.out.printf("%d%n", indiceMaior);
		
		sc.close();
		
	}
}
