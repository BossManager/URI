package iniciante.pagina1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1009 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner et=new Scanner(System.in);
		String nome;
		double a,b;
		nome=et.nextLine();
		a=Double.parseDouble(et.nextLine());
		b=Double.parseDouble(et.nextLine());
		System.out.printf("TOTAL = R$ %.2f\n",(a+b*0.15));
		et.close();
	}
}
