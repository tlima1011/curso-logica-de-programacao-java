import java.util.Locale;
import java.util.Scanner;

public class MainExecVet8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		double altura[] = new double[n]; 
		Character sexo[] = new Character[n]; 
		int homens = 0, mulheres = 0; 
		double mediaMulheres = 0.0, somaMulheres = 0.0; 
		
		for(int i = 0; i < n;i++) { 
			altura[i] = sc.nextDouble(); 
			do {
				sexo[i] = sc.next().charAt(0); 
				sexo[i] = sexo[i].toUpperCase(sexo[i]);
				if(!(sexo[i].equals('M') || sexo[i].equals('F'))) {
					System.out.println("Digite novamente o sexo M ou F");
				}
			}while(!(sexo[i].equals('M') || sexo[i].equals('F')));
		}
		double menorAltura = altura[0]; 
		double maiorAltura = altura[0]; 
		
		for(int i = 0; i < n;i++) { 
			if(altura[i] > maiorAltura) { 
				maiorAltura = altura[i];
			}
			if(altura[i] < menorAltura) { 
				menorAltura = altura[i];
			}
		}
				
		for(int i = 0; i < n; i++) { 
			if(sexo[i].equals('M')) {
				homens = homens + 1;
			}
			else if(sexo[i].equals('F')){
				somaMulheres += altura[i];
				mulheres = mulheres + 1; 
			}
		}
		
		mediaMulheres = somaMulheres / (double) mulheres;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura); 
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
		System.out.printf("Numero de homens = %d%n", homens);
		sc.close();
	}
}
