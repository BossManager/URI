package iniciante.pagina2;

import java.util.Scanner;

public class Problema1070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int o = 0;
		while (o < 6) {
			if (n % 2 == 1) {
				System.out.println(n);
				o++;
			}
			n++;
		}
		sc.close();
	}
}
