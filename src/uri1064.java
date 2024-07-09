import java.util.Locale;
import java.util.Scanner;

public class uri1064 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		double s = 0.0, m = 0.0;
		int p = 0;   
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		double n5 = sc.nextDouble();
		double n6 = sc.nextDouble();
		
		if(n1 > 0) {
			p++; 
			s += n1;
		}
		if(n2 > 0) {
			p++; 
			s += n2;
		}
		if(n3 > 0) {
			p++; 
			s += n3;
		}
		if(n4 > 0) {
			p++; 
			s += n4;
		}
		if(n5 > 0) {
			p++; 
			s += n5;
		}
		if(n6 > 0) {
			p++; 
			s += n6;
		}
		
		m =  s / p;
		System.out.printf("%d valores positivos%n",p); 
		System.out.printf("%.1f%n",m);
		
		sc.close();

	}

}
