package iniciante.pagina1;

import java.util.Scanner;

public class Problema1011 {
	public static void main(String[] args) {
		Scanner et=new Scanner(System.in);
		double raio,pi=3.14159,volume;
		raio=et.nextDouble();
		volume=(4.0/3)*pi*Math.pow(raio, 3);
		System.out.printf("VOLUME = %.3f\n",volume);
		et.close();
	}
}
