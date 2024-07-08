import java.util.Locale;
import java.util.Scanner;

public class uri1040 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in); 
		
		float n1 = sc.nextFloat(); 
		float n2 = sc.nextFloat(); 
		float n3 = sc.nextFloat(); 
		float n4 = sc.nextFloat(); 
		
		float media = (2f * n1 + 3f * n2 + 4f * n3 + 1f * n4) / (float) (2 + 3 + 4 + 1);
		//Pesos: 2, 3, 4 e 1
		System.out.printf("Media: %.1f%n", media);
		if(media >= 7f) { 
			System.out.println("Aluno aprovado.");
		}
		else if(media >= 5f && media <= 6.9f) { 
			float ne = sc.nextFloat(); 
			System.out.println("Aluno em exame."); 
			System.out.printf("Nota do exame: %.1f%n", ne);
			float mf = (media + ne) / 2f;
			if(mf >= 5f) {
				System.out.println("Aluno aprovado."); 
			}
			else {
				System.out.println("Aluno reprovado."); 
			}
			System.out.printf("Media final: %.1f%n", mf);
		}
		else {
			System.out.println("Aluno reprovado.");
		}
	
		sc.close();
	}

}
