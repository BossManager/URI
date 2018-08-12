package iniciante.pagina2;

import java.util.Scanner;

public class Problema1060 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = 0;
		float n1 = Float.parseFloat(sc.nextLine());
		if (n1 > 0)
			p++;
		float n2 = Float.parseFloat(sc.nextLine());
		if (n2 > 0)
			p++;
		float n3 = Float.parseFloat(sc.nextLine());
		if (n3 > 0)
			p++;
		float n4 = Float.parseFloat(sc.nextLine());
		if (n4 > 0)
			p++;
		float n5 = Float.parseFloat(sc.nextLine());
		if (n5 > 0)
			p++;
		float n6 = Float.parseFloat(sc.nextLine());
		if (n6 > 0)
			p++;
		System.out.println(p + " valores positivos");
		sc.close();
	}
}
