import java.util.Scanner;

public class uri1044 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		String r = ""; 
		
		if(a > b) { 
			if(a % b == 0) {
				r = "Sao Multiplos";
			}
			else {
				r = "Nao sao Multiplos";
			}
		}
		else if(b > a) {
			if(b % a == 0) {
				r = "Sao Multiplos";
			}
			else {
				r = "Nao sao Multiplos";
			}
		}
		System.out.println(r);
		sc.close();
	}
}
