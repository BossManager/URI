package iniciante.pagina1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1012 {
	public final static double PI=3.14159;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada=new Scanner(System.in);
		double a,b,c;
		a=entrada.nextDouble();
		b=entrada.nextDouble();
		c=entrada.nextDouble();
		System.out.printf("TRIANGULO: %.3f\n",((a*c)/2));
		System.out.printf("CIRCULO: %.3f\n",(c*c*PI));
		System.out.printf("TRAPEZIO: %.3f\n",((a+b)*c)/2);
		System.out.printf("QUADRADO: %.3f\n",b*b);
		System.out.printf("RETANGULO: %.3f\n",a*b);
		entrada.close();
	}
}
