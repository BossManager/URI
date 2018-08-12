package iniciante.pagina1;

import java.util.Scanner;

public class Problema1007 {
	public static void main(String[] args) {
		int a,b,c,d,DIFERENCA;
		Scanner entrada=new Scanner(System.in);
		a=entrada.nextInt();
		b=entrada.nextInt();
		c=entrada.nextInt();
		d=entrada.nextInt();
		DIFERENCA=(a*b-c*d);
		System.out.println("DIFERENCA = "+DIFERENCA);
		entrada.close();
	}
}
