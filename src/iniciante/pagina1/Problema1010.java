package iniciante.pagina1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1010 {
	public static void main(String[] args) {
		Scanner et=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int a,b,c,d;
		double e,f;
		String[] str1,str2;
		str1=et.nextLine().split(" ");
		str2=et.nextLine().split(" ");
		a=Integer.parseInt(str1[0]);
		b=Integer.parseInt(str1[1]);
		e=Double.parseDouble(str1[2]);
		c=Integer.parseInt(str2[0]);
		d=Integer.parseInt(str2[1]);
		f=Double.parseDouble(str2[2]);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",(b*e+d*f));
		et.close();
	}
}
