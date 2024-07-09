import java.util.Scanner;

public class uri1070 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0; 
		
		if(n > 0) {
			if(n % 2 == 0) { 
				n1 += n + 1;
				n2 += n1 + 2; 
				n3 += n2 + 2; 
				n4 += n3 + 2; 
				n5 += n4 + 2; 
				n6 += n5 + 2; 
			}
		}
		System.out.printf("%d%n%d%n%d%n%d%n%d%n%d%n", n1,n2,n3,n4,n5,n6);
		sc.close();
	}
}
