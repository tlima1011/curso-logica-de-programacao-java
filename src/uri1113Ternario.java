import java.util.Scanner;

public class uri1113Ternario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int x = sc.nextInt(); 
		int y = sc.nextInt(); 
		while(x != y) { 
			System.out.println(x < y ? "Crescente":"Decrescente"); 
			x = sc.nextInt(); 
			y = sc.nextInt(); 
		}
		sc.close();
	}
}
