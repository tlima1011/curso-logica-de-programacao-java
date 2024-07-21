
public class TesteMesa3 {

	public static void main(String[] args) {

		int n = 3;
		int mat[][] = new int[n][n];
		int vet[] = new int[n];

		for (int i = 0; i < n; i++) {
			int x = 0;
			for (int j = 0; j < n; j++) {
				mat[i][j] = i + j;
				x = x + mat[i][j];
			}
			vet[i] = x;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int v : vet) {
			System.out.print(v + " ");
		}
	}
}
