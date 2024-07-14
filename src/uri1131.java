import java.util.Scanner;

public class uri1131 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int grenal = 1, gg = 0, gi = 0, vg = 0, vi = 0, emp = 0, jogos = 0; 
		String time = ""; 
		
		while(grenal == 1){ 
			gi = sc.nextInt(); 
			gg = sc.nextInt(); 
			if(gg > gi) { 
				vg = vg + 1; 
			}
			else if(gi > gg){
				vi = vi + 1; 
			}
			else {
				emp = emp + 1; 
			}
			jogos = jogos + 1; 
			System.out.println("Novo grenal (1-sim 2-nao)"); 
			grenal = sc.nextInt();
		}
		
		time = (vg > vi) ? "Gremio" : "Inter";
		
		System.out.printf("%d grenais%n", jogos);
		System.out.printf("Inter:%d%n", vi); 
		System.out.printf("Gremio:%d%n", vg);
		System.out.printf("Empates:%d%n", emp);
		System.out.printf("%s venceu mais%n", time);
		
		sc.close();

	}
}
