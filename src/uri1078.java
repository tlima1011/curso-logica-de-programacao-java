import java.util.Scanner;

public class uri1078 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;

		while (2 > n || n > 1000) {
			n = sc.nextInt();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d%n", i, n, i * n);
		}

		sc.close();
	}

}
