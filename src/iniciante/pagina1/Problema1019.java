package iniciante.pagina1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1019 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int x=sc.nextInt();
		int horas=0,minutos=0,segundos=0;
		if(x>=3600){
			horas=x/3600;
			x=x-(horas*3600);
		}
		if(x>=60){
			minutos=x/60;
			x=x-(minutos*60);
		}
		segundos=x;
		System.out.println(horas+":"+minutos+":"+segundos);
		sc.close();
	}
}
