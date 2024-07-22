
public class TesteMesa4Matriz {

	public static void main(String[] args) {
		
		int m = 5; 
		int mat[][] = new int[m][m]; 
		for(int i = 0; i < m;i++ ) { 
			mat[3][i] = 10; 
		}
		for(int i = 0; i < m;i++) { 
			mat[i][4] = 10 * i; 
			mat[i][i] = 50;
		}
		for(int i = 0; i < m;i++) { 
			for(int j = 0; j < m; j++) { 
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println();
		}
	}
}
