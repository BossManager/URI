package iniciante.pagina1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1017 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.printf("%.3f\n",((float)x*y)/12);
		sc.close();
	}
}
