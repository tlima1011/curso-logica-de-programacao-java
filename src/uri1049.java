import java.util.Scanner;

public class uri1049 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		String s1 = sc.next(); 
		String s2 = sc.next();
		String s3 = sc.next();
		String resultado = ""; 
		
		if(s1.equalsIgnoreCase("vertebrado")) {
			if(s2.equalsIgnoreCase("ave")) { 
				if(s3.equalsIgnoreCase("carnivoro")) {
					resultado = "aguia";
				}
				else if (s3.equalsIgnoreCase("onivoro")){
					resultado = "pomba";
				}
			}
			else if(s2.equalsIgnoreCase("mamifero")) {
				if(s3.equalsIgnoreCase("onivoro")) {
					resultado = "homem";
				}
				else if(s3.equalsIgnoreCase("herbivoro")){
					resultado = "vaca";
				}
				
			}
		}
		else if(s1.equalsIgnoreCase("invertebrado")){ 
			if(s2.equalsIgnoreCase("inseto")) {
				if(s3.equalsIgnoreCase("hematofago")) {
					resultado = "pulga";
				}
				else if(s3.equalsIgnoreCase("herbivoro")) {
					resultado = "herbivoro";
				}
			}
			else if(s2.equalsIgnoreCase("anelideo") ){
				if(s3.equalsIgnoreCase("hematofago")) {
					resultado = "sanguessuga";
				}
				else if(s3.equalsIgnoreCase("onivoro")) {
					resultado = "minhoca"; 
				}
			}
		}
		else {
			System.out.println("Inválido");
		}
		System.out.println(resultado);
		sc.close();
	}

}
