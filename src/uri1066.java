import java.util.Scanner;

public class uri1066 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int p = 0, i = 0, pos = 0, neg = 0;
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();

		if (n1 % 2 == 0) {
			p++;
		} else {
			i++;
		}
		if (n2 % 2 == 0) {
			p++;
		} else {
			i++;
		}
		if (n3 % 2 == 0) {
			p++;
		} else {
			i++;
		}
		if (n4 % 2 == 0) {
			p++;
		} else {
			i++;
		}
		if (n5 % 2 == 0) {
			p++;
		} else {
			i++;
		}

		if (n1 > 0 && n1 != 0) {
			pos++;
		} else if (n1 < 0 && n1 != 0) {
			neg++;
		}
		if (n2 > 0 && n2 != 0) {
			pos++;
		} else if (n2 < 0 && n2 != 0) {
			neg++;
		}
		if (n3 > 0 && n3 != 0) {
			pos++;
		} else if (n3 < 0 && n3 != 0) {
			neg++;
		}
		if (n4 > 0 && n4 != 0) {
			pos++;
		} else if (n4 < 0 && n4 != 0) {
			neg++;
		}
		if (n5 > 0 && n5 != 0) {
			pos++;
		} else if (n5 < 0 && n5 != 0) {
			neg++;
		}

		System.out.printf("%d valor(es) par(es)%n", p);
		System.out.printf("%d valor(es) impar(es)%n", i);
		System.out.printf("%d valor(es) positivo(s)%n", pos);
		System.out.printf("%d valor(es) negativo(s)%n", neg);
		sc.close();

	}

}
