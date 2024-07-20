import java.util.Scanner;

public class MainExecVet2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		int vet[] = new int[n]; 
		int cp = 0; 
		
		for(int i = 0; i < n;i++) { 
			vet[i] = sc.nextInt(); 
		}
		
		for(int i = 0; i < n;i++) {
			if(vet[i] % 2 == 0) { 
				System.out.print(vet[i] + " "); 
				cp = cp + 1; 
			}
		}	
		System.out.println();
		System.out.println(cp); 
		sc.close();
	}
}
