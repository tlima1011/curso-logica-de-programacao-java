
public class TesteMesa5Matriz {

	public static void main(String[] args) {

		int n = 3, x = 0;
		int mat[][] = new int[n][n];
		int v[] = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = i + j;
				x += mat[i][j];
			}
			v[i] = x;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			System.out.print(v[i] + " ");
		}
	}
}
