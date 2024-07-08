import java.util.Locale;
import java.util.Scanner;

public class uri1048 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		double porcentagem = 0.0, reajuste = 0.0; 
		double salario = sc.nextDouble(); 
		String p = "%"; 
		
		if(salario >= 0 && salario <= 400) { 
			porcentagem = 0.15;
		}
		else if(salario <= 800) { 
			porcentagem = 0.12; 
		}
		else if(salario <= 1200) { 
			porcentagem = 0.10;
		}
		else if(salario <= 2000) {
			porcentagem = 0.07; 
		}
		else { 
			porcentagem = 0.04;
		}
		reajuste = salario * porcentagem; 
		double novoSalario = salario + reajuste;
		
		System.out.printf("Novo salario: %.2f%n", novoSalario); 
		System.out.printf("Reajuste ganho: %.2f%n", reajuste); 
		System.out.printf("Em percentual: %.0f %s%n", ( porcentagem * 100),p);
		
		sc.close();
	}
}
