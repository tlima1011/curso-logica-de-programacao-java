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
		
		
		
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro Total: %.2f", lucroTotal);
			
		sc.close();

	}

}
