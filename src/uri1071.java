import java.util.Scanner;

public class uri1071 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int aux = 0, soma = 0; 
		int x = sc.nextInt(); 
		int y = sc.nextInt();
		
		if(y < x) { 
			aux = x; 
			x = y; 
			y = aux; 
		}
		
		for(int i = x + 1; i < y;i++) { 
			if(i %2 != 0) { 
				soma += i; 
			}
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
