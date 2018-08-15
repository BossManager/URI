package iniciante.pagina9;


import java.util.Locale;
import java.util.Scanner;

public class Problema2686 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		while(sc.hasNextFloat()) {
			float ang = sc.nextFloat();
			float minute = ang*4;
			int horas = (int) (minute/60);
			int minutos = (int) (minute - horas*60);
			int segundos = (int) (minute-(horas*60)-minutos)*60;
			horas+=6;
			if(horas>=24)
				horas -= 24;
			
			if((ang < 90 && ang >= 0 )|| (ang == 360)) {
				System.out.println("Bom Dia!!");
				
			}else if(ang >= 90 && ang < 180) {
				System.out.println("Boa Tarde!!");
				System.out.printf("%2d:%2d:%2d",horas,minutos,segundos);
			}else if(ang >= 180 && ang<270) {
				System.out.println("Boa Noite!!");
				System.out.printf("%2d:%2d:%2d",horas,minutos,segundos);
			}else if(ang>=270 && ang < 360){
				System.out.println("De Madrugada!!");
				System.out.printf("%2d:%2d:%2d",horas,minutos,segundos);
			}
		}
		sc.close();
	}
}
