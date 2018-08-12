package iniciante.pagina1;

import java.util.Scanner;

public class Problema1004 {
	public static void main(String[] args) {
		int A,B;
		Scanner entrada=new Scanner(System.in);
		A=entrada.nextInt();
		B=entrada.nextInt();
		System.out.println("PROD = "+(A*B));
		entrada.close();
	}
}
