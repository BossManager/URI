package iniciante.pagina1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1008 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int a,b;
	    float c,salario;
	    a = entrada.nextInt();
	    b = entrada.nextInt();
	    c = entrada.nextFloat();
		salario=b*c;
		System.out.println("NUMBER = "+a);
		System.out.printf("SALARY = U$ %.2f\n",salario);
		entrada.close();
	}
}
