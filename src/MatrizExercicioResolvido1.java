import java.util.Scanner;

public class MatrizExercicioResolvido1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		int mat[][] = new int[n][n]; 
		int negativos = 0; 
		
		for(int i = 0; i < n;i++) { 
			for(int j = 0; j < n;j++) { 
				mat[i][j] = sc.nextInt();
				if(mat[i][j] < 0) {
					negativos++;
				}
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL: ");
//		for(int i = 0; i < n;i++) { 
//			System.out.printf("%d ", mat[i][i]);
//		}
//		System.out.print("\n\n");
		for(int i = 0; i < n; i ++) { 
			for(int j = 0; j < n;j++) { 
				if(i == j) { 
					System.out.printf("%d ", mat[i][i]);
				}
				else { 
					System.out.printf("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("QUANTIDADE DE NEGATIVOS = "+ negativos);
		sc.close();	
	}
}
