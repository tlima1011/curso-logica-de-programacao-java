import java.util.Locale;
import java.util.Scanner;

public class uri1060 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int p = 0, n = 0; 
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double n5 = sc.nextDouble();
		double n6 = sc.nextDouble();
		
		if(n1 > 0) {
			p++; 
		}
		else {
			n++;
		}
		if(n2 > 0) {
			p++; 
		}
		else {
			n++;
		}
		if(n3 > 0) {
			p++; 
		}
		else {
			n++;
		}
		if(n4 > 0) {
			p++; 
		}
		else {
			n++;
		}
		if(n5 > 0) {
			p++; 
		}
		else {
			n++;
		}
		if(n6 > 0) {
			p++; 
		}
		else {
			n++;
		}
		System.out.printf("%d valores positivos%n",p); 
		sc.close();
	}

}
