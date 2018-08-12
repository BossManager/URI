package iniciante.pagina2;

import java.util.Locale;
import java.util.Scanner;

public class Problema1048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String[] str;
		str = sc.nextLine().split(" ");
		double x = Double.parseDouble(str[0]);
		double reajuste = 0;
		double j = 0;
		if (x > 0 && x <= 400) {
			j = 0.15;
			reajuste = x * j;
		} else if (x >= 400.01 && x <= 800) {
			j = 0.12;
			reajuste = x * j;
		} else if (x >= 800.01 && x <= 1200) {
			j = 0.10;
			reajuste = x * j;
		} else if (x >= 1200.01 && x <= 2000) {
			j = 0.07;
			reajuste = x * j;
		} else if (x > 2000) {
			j = 0.04;
			reajuste = x * j;
		}
		System.out.printf("Novo salario: %.2f\n", reajuste + x);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.printf("Em percentual: %.0f %%\n", j * 100.00);
		sc.close();
	}
}
