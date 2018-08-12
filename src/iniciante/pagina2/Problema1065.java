package iniciante.pagina2;

import java.util.Scanner;

public class Problema1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int par = 0;
		int n1 = sc.nextInt();
		if (n1 % 2 == 0)
			par++;
		int n2 = sc.nextInt();
		if (n2 % 2 == 0)
			par++;
		int n3 = sc.nextInt();
		if (n3 % 2 == 0)
			par++;
		int n4 = sc.nextInt();
		if (n4 % 2 == 0)
			par++;
		int n5 = sc.nextInt();
		if (n5 % 2 == 0)
			par++;
		System.out.println(par + " valores pares");
		sc.close();
	}
}
