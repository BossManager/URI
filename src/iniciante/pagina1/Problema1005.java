package iniciante.pagina1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1005 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada=new Scanner(System.in);
		double a,b,media,peso1=3.5,peso2=7.5;
		a=entrada.nextDouble();
		b=entrada.nextDouble();
		media=((a*peso1)+(b*peso2))/(peso1+peso2);
		System.out.printf("MEDIA = %.5f\n",media);
		entrada.close();
	}
}
