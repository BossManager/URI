package iniciante.pagina2;

import java.util.Locale;
import java.util.Scanner;

public class Problema1064 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int p = 0;
		float media = 0;
		float n1 = Float.parseFloat(sc.nextLine());
		if (n1 > 0) {
			p++;
			media += n1;
		}
		float n2 = Float.parseFloat(sc.nextLine());
		if (n2 > 0) {
			p++;
			media += n2;
		}
		float n3 = Float.parseFloat(sc.nextLine());
		if (n3 > 0) {
			p++;
			media += n3;
		}
		float n4 = Float.parseFloat(sc.nextLine());
		if (n4 > 0) {
			p++;
			media += n4;
		}
		float n5 = Float.parseFloat(sc.nextLine());
		if (n5 > 0) {
			p++;
			media += n5;
		}
		float n6 = Float.parseFloat(sc.nextLine());
		if (n6 > 0) {
			p++;
			media += n6;
		}
		System.out.println(p + " valores positivos");
		System.out.printf("%.1f\n", media / (float) p);
		sc.close();
	}
}
