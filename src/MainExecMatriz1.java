import java.util.Scanner;

public class MainExecMatriz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int m = sc.nextInt(); 
		int n = sc.nextInt(); 
		
		int a[][] = new int[m][n]; 
		int negativos = 0; 
		
		for(int i = 0; i < m;i++) { 
			for(int j = 0; j < n;j++) { 
				a[i][j] = sc.nextInt(); 
				if(a[i][j] < 0) {
					negativos++; 
				}
			}
		}
		System.out.println("VALORES NEGATIVOS:");
		for(int i = 0; i < m;i++) {
			for(int j = 0; j < n;j++) { 
				if(a[i][j] < 0) {
					System.out.println(a[i][j]); 
				}
			}	
		}
		System.out.println("Quantidade: " + negativos);
		sc.close();
	}
}
