import java.util.Scanner;

public class uri1042 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int a = 0, b = 0, c = 0; 
		int n1 = sc.nextInt(); 
		int n2 = sc.nextInt();
		int n3 = sc.nextInt(); 
		
		if(n1 < n2 && n1 < n3) { 
			a = n1; 
			if(n2 < n3) { 
				b = n2; 
				c = n3;
			}
			else {
				b = n3;
				c = n2; 
			}
		}
		else if(n2 < n1 && n2 < n3) { 
			a = n2; 
			if(n1 < n3) {
				b = n1;
				c = n3;
			}
			else {
				b = n3;
				c = n1; 
			}
		}
		else { 
			a = n3; 
			if(n1 < n2) { 
				b = n1;
				c = n2; 
			}
			else {
				b = n2; 
				c = n1;
			}
		}
		
		System.out.printf("%d%n%d%n%d%n%n", a, b, c);
		System.out.printf("%d%n%d%n%d%n", n1, n2, n3);
	
		sc.close();
	}
}
