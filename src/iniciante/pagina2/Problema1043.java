package iniciante.pagina2;

import java.util.Locale;
import java.util.Scanner;

public class Problema1043 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String[] str;
		str=sc.nextLine().split(" ");
		double a=Double.parseDouble(str[0]);
		double b=Double.parseDouble(str[1]);
		double c=Double.parseDouble(str[2]);
		double area=((a+b)*c)/2;
		if(Math.abs(b-c)<a && a<b+c){
			if(Math.abs(a-c)<b && b<a+c){
				if(Math.abs(a-b)<c && c<a+b){
					System.out.printf("Perimetro = %.1f\n",a+b+c);
				}else{
					System.out.printf("Area = %.1f\n",area);
				}
			}else{
				System.out.printf("Area = %.1f\n",area);
			}
		}else{
			System.out.printf("Area = %.1f\n",area);
		}
		sc.close();
	}
}
