
public class TesteMesa6Matriz {
	
	public static void main(String[] args) {
		
		int n = 4; 
		int mat[][] = new int[n][n];
		
		for(int i = 0 ; i < n;i++) { 
			for(int j = 0; j < i;j++) { 
				mat[i][j] = (i + 1) * 10;
			}
		}
		for(int i = 0 ; i < n;i++) { 
			for(int j = 0; j < n;j++) { 
				if(mat[i][j] != 0) {
					System.out.print(mat[i][j] + " ");
				}	
			}
			System.out.println();
		}
	}
}
