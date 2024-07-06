import java.util.Scanner;

public class uri1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int minuto, hora, segundo, resto; 
		int n = sc.nextInt(); 
		hora = n / 3600; 
		resto = n % 3600; 
		minuto = resto / 60; 
		segundo = resto % 60; 
		System.out.println(hora + ":" + minuto + ":" + segundo);
		
		
		sc.close();
	}

}
