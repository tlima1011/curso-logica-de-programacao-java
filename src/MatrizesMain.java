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
					mostraColuna(mat, n);
					break;
				case 5: 
					mostrarIdentidade(mat, n);
					break;
					
			}
		}while(op != 6);
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
		for (int i = 0; i < n; i++) {
            // Acessa o elemento da diagonal secundária na posição (i, n - 1 - i)
            int elemento = mat[i][n - 1 - i];
            System.out.print(elemento + " ");
        }
	}
	
	private static void mostraLinha(int[][] mat, int n) {
		int l = sc.nextInt(); 
		for(int i = 0 ; i < n;i++) {
			for(int j = 0; j < n; j++) { 
				if(i == l) { 
					System.out.print(mat[i][j] + " ");
				}	
			}
		}
		System.out.println();
	}
	
	private static void mostraColuna(int[][] mat, int n) {
		int c = sc.nextInt(); 
		for(int i = 0 ; i < n;i++) {
			for(int j = 0; j < n; j++) { 
				if(j == c) { 
					System.out.println(mat[i][c]);
				}
			}
		}
		//System.out.println();
	}
	
	private static void mostrarIdentidade(int[][] mat, int n) {
		for(int i = 0; i < n;i++) { 
			for(int j = 0; j < n;j++) { 
				System.out.print(i == j ? 1 + " " : 0 + " ");
			}
			System.out.println();
		}
	}
}
