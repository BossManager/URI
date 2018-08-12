package iniciante.pagina2;

import java.util.Scanner;

public class Problema1072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] vetor = new int[n];
		int i = 0, a, in = 0, out = 0;
		if (n < 10000) {
			for (i = 0; i < n; i++) {
				a = sc.nextInt();
				if (Math.pow(-10, 7) < a && a < Math.pow(10, 7)) {
					vetor[i] = a;
					if (a >= 10 && a <= 20)
						in++;
					else
						out++;
				} else {
					break;
				}
			}
		}
		if (i == n) {
			System.out.println(in + " in");
			System.out.println(out + " out");
		}
		sc.close();
	}
}
