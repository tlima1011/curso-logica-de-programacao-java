import java.util.Scanner;

public class MatrizesMain {
	
	static Scanner sc = new Scanner(System.in); 

	public static void main(String[] args) {
		
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
			System.out.println("[ 5 ] - MATRIZ IDENTIDADE" );
			System.out.println("[ 6 ] - SAIR" );
			op = sc.nextInt();
			switch(op) { 
				case 1: 
					diagonalPrincipal(mat, n); 
					break; 
				case 2: 
					diagonalSecundaria(mat, n);
					break;
				case 3: 
					mostraLinha(mat, n);
					break;
				case 4: 
					//mostrarColuna(mat, n);
					break;
				case 5: 
					//mostrarIdentidade(mat, n);
					break;
					
			}
		}while(op != 5);
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
	
	private static void diagonalSecundaria(int[][] mat, int n) {
		for(int i = 0; i < n;i++) { 
			for(int j = 0; j < n;j++) { 
				System.out.println(mat[i][n - i - 1]);
				//System.out.print(i == j ? mat[i][j] : "  ");
			}
			System.out.println();
		}
	}
	
	private static void mostraLinha(int[][] mat, int n) {
		int l = sc.nextInt(); 
		for(int i = l ; i < n;i++) {
			for(int j = 0; j < n; j++) { 
				System.out.print(mat[l][j] + "\n");
			}
		}
		
	}
}
