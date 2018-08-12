package iniciante.pagina1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1015 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String[] str1,str2;
		str1=sc.nextLine().split(" ");
		str2=sc.nextLine().split(" ");
		double x1=Double.parseDouble(str1[0]);
		double y1=Double.parseDouble(str1[1]);
		double x2=Double.parseDouble(str2[0]);
		double y2=Double.parseDouble(str2[1]);
		x2=Math.pow(x2-x1,2);
		y2=Math.pow(y2-y1,2);
		System.out.printf("%.4f\n",Math.sqrt(x2+y2));
		sc.close();
		
	}
}
