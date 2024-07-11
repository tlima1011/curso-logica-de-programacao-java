import java.util.Scanner;

public class uri1034 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int codigo = 0, ca = 0, cg = 0, cd = 0;
		do {
			System.out.println("1.Alcool ");
			System.out.println("2.Gasolina");
			System.out.println("3.Diesel");
			System.out.println("4.Fim"); 
			codigo = sc.nextInt(); 
			if(codigo != 1 && codigo != 2 && codigo != 3 && codigo !=4) { 
				System.out.println("Invalido");
			}
			switch(codigo) { 
				case 1: 
					ca++;
					break; 
				case 2: 
					cg++;
					break;
				case 3: 
					cd++;
					break;
				case 4:
					break;
			}
		}while(codigo != 4);
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", ca);
		System.out.printf("Gasolina: %d%n", cg);
		System.out.printf("Diesel: %d%n", cd);
				
		sc.close();
	}
}
