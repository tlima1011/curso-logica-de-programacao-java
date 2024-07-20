import java.util.Locale;
import java.util.Scanner;

public class MainExecVet9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		int n = sc.nextInt(); 
		String produto[] = new String[n]; 
		double precoCompra[] = new double[n]; 
		double precoVenda[] = new double[n]; 
		double totalCompra = 0.0; 
		double totalVenda = 0.0; 
		double lucroTotal = 0.0; 
		double lucro = 0.0; 
		double porcentagemLucro = 0.0; 
		int abaixo10Porcento = 0; 
		int entre10e20Porcento = 0; 
		int acima20 = 0; 
		
		for(int i = 0; i < n;i++) { 
			produto[i] = sc.next(); 
			precoCompra[i] = sc.nextDouble(); 
			precoVenda[i] = sc.nextDouble(); 
		}
		
		for(int i = 0; i < n;i++) { 
			totalCompra += precoCompra[i]; 
			totalVenda += precoVenda[i]; 
		}
		
		for(int i = 0; i < n;i++) { 
			lucroTotal = totalVenda - totalCompra; 			
		}
		
		for(int i = 0; i < n;i++) { 
			
			lucro = precoVenda[i] - precoCompra[i]; 
			porcentagemLucro = (lucro / precoCompra[i]) * 100; 
			
			if(porcentagemLucro < 10.0) { 
				abaixo10Porcento = abaixo10Porcento + 1; 
			}
			else if(porcentagemLucro <= 20.0) { 
				entre10e20Porcento = entre10e20Porcento  + 1; 
			}
			else {
				acima20 = acima20 + 1; 
			}
		}
		
		System.out.println("Lucro abaixo de 10%: " + abaixo10Porcento);
		System.out.println("Lucro entre 10% e 20%: " + entre10e20Porcento);
		System.out.println("Lucro acima de 20%: " + acima20);
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro Total: %.2f%n", lucroTotal);		
		sc.close();
	}
}
