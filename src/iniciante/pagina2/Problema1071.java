package iniciante.pagina2;

import java.util.Scanner;

public class Problema1071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;
		int aux;
		if (x > y) {
			aux = y;
			y = x;
			x = aux;
		}
		for (int i = x + 1; i < y; i++) {
			if (i % 2 == 1 || i % 2 == -1)
				soma += i;
		}
		System.out.println(soma);
		sc.close();
	}
}
