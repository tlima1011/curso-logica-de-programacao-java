import java.util.Scanner;

public class uri1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int p = 0;
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt(); 
		
		if(n1 % 2 ==0) {
			p++;			
		}
		if(n2 % 2 ==0) {
			p++;			
		}
		if(n3 % 2 ==0) {
			p++;			
		}
		if(n4 % 2 ==0) {
			p++;			
		}
		if(n5 % 2 ==0) {
			p++;			
		}
		System.out.printf("%d valores pares%n",p);
		sc.close();
	}

}
