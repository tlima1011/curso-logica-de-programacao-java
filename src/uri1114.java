import java.util.Scanner;

public class uri1114 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int password = 2002; 
		int senha = 0;
		String acesso = ""; 
		
		while(senha != password) { 
			senha = sc.nextInt();
			if(senha != password) { 
				System.out.println("Senha Invalida");
			}else {
				acesso = "Acesso Permitido";
			}
		}
		System.out.println(acesso);
		
		sc.close();
	}
}
