package iniciante.pagina1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1036 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String[] str=sc.nextLine().split(" ");
		double a=Double.parseDouble(str[0]);
		double b=Double.parseDouble(str[1]);
		double c=Double.parseDouble(str[2]);
		if(a>0){
			double delta=Math.sqrt((b*b)-(4*a*c));
			if(delta>0){
				System.out.printf("R1 = %.5f\n",(-b+delta)/(2*a));
				System.out.printf("R2 = %.5f\n",(-b-delta)/(2*a));
			}else if(delta==0){
				System.out.printf("R1 = %.5f\n",(-b)/(2*a));
			}else{
				System.out.println("Impossivel calcular");
			}
		}else{
			System.out.println("Impossivel calcular");
		}
		sc.close();
	}
}
