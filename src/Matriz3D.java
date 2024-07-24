
public class Matriz3D {

	public static void main(String[] args) {
		
		int n = 5; 
		int mat[][][] = new int[n][n][n]; 
		
		for(int i = 0; i < n;i++) { 
			for(int j = 0; j < n; j++) { 
				for(int k =0; k < n; k++) { 
					mat[i][j][k] = 1 + i + j + k; 
				}
			}
		}
		
		for(int i = 0; i < n;i++) { 
			for(int j = 0; j < n; j++) { 
				for(int k =0; k < n; k++) { 
					System.out.print(mat[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		

	}

}
