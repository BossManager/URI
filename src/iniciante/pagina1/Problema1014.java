package iniciante.pagina1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1014 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		double Y = sc.nextDouble();
		double Z = X / Y;
		System.out.printf("%.3f km/l\n", Z);
		sc.close();
	}
}
