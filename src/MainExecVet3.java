import java.util.Scanner;

public class MainExecVet3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int q = sc.nextInt(); 
		int a[] = new int[q]; 
		int b[] = new int[q];
		int c[] = new int[q]; 
		
		for(int i = 0; i < q; i++) { 
			a[i] = sc.nextInt(); 
		}
		
		for(int j = 0; j < q; j++) { 
			b[j] = sc.nextInt(); 
			c[j] = a[j] + b[j]; 
		}
		
		for(int vetC : c) { 
			System.out.printf("%d ", vetC);
		}
		
		
		
		sc.close();

	}

}
