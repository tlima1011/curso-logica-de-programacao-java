import java.util.Scanner;

public class MatrizesMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		int mat[][] = new int[n][n]; 
		
		for(int i = 0; i < n;i++) { 
			for(int j = 0; j < n;j++) { 
				mat[i][j] = i + j + 1; 
			}
		}
		
		for(int i = 0; i < n;i++) { 
			for(int j = 0; j < n;j++) { 
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
		int op = 0; 
		
		do {
			System.out.println("INFORME O TIPO DE MATRIZ"); 
			System.out.println("[ 1 ] - DIAGONAL PRINCIPAL" );
			System.out.println("[ 2 ] - DIAGONAL SECUNDÁRIA" );
			System.out.println("[ 3 ] - LINHA" );
			System.out.println("[ 4 ] - COLUNA" ); 
			op = sc.nextInt();
			switch(op) { 
				case 1: 
					diagonalPrincipal(mat, n); 
					break; 
			}
			
			
		}while(op != 1 || op != 2 || op != 3 || op != 4);
	
		
		sc.close();
		

	}

	private static void diagonalPrincipal(int[][] mat, int n) {
		for(int i = 0; i < n;i++) { 
			for(int j = 0; j < n;j++) { 
				System.out.print(i == j ? mat[i][j] : "  ");
			}
			System.out.println();
		}
	}

}
