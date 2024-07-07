import java.util.Scanner;

public class uri1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int dias, meses, anos, resto;
		
		int d = sc.nextInt(); 
		anos = d / 365; 
		resto = d % 365;
		meses = d % 365 / 30; 
		dias = resto % 30;
		
		System.out.printf("%d ano(s)%n",anos);
		System.out.printf("%d mes(es)%n",meses);
		System.out.printf("%d dia(s)%n",dias);
		
		sc.close();
	}

}
