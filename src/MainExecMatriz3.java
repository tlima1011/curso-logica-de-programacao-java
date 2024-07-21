import java.util.Scanner;

public class MainExecMatriz3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		int mat[][] = new int[n][n];
		int vet[] = new int[n]; 
 		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n;j++) {
				mat[i][j] = sc.nextInt(); 
			}
		}
		
		for(int i = 0; i < n; i++) {
			int maiorLinha = 0; 
			for(int j = 0; j < n;j++) {
				if(mat[i][j] > maiorLinha) {
					maiorLinha = mat[i][j]; 
					vet[i] = maiorLinha; 
				}
			}
		}
		
		for(int v: vet) { 
			System.out.println(v);
		}
		
		sc.close();
	}

}
