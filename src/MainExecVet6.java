import java.util.Scanner;

public class MainExecVet6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		String nome[] = new String[n]; 
		int idade[] = new int[n]; 
		
		for(int i = 0; i < n;i++) { 
			nome[i] = sc.next(); 
			idade[i] = sc.nextInt(); 
		}
		
		int idadeMaisVelho = idade[0]; 
		String nomeMaisVelho = nome[0]; 
		
		for(int i = 0; i < n;i++) { 
			if(idade[i] > idadeMaisVelho) { 
				nomeMaisVelho = nome[i]; 
				idadeMaisVelho = idade[i]; 
			}
		}
		System.out.printf("Pessoa mais velha: %s com %d anos.%n", nomeMaisVelho, idadeMaisVelho);
		sc.close();
	}
}
