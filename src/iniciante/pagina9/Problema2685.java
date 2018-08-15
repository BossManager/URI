package iniciante.pagina9;

import java.util.Scanner;

public class Problema2685 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int ang = sc.nextInt();
			
			if((ang < 90 && ang >= 0 )|| (ang == 360)) {
				System.out.println("Bom Dia!!");
			}else if(ang >= 90 && ang < 180) {
				System.out.println("Boa Tarde!!");
			}else if(ang >= 180 && ang<270) {
				System.out.println("Boa Noite!!");
			}else if(ang>=270 && ang < 360){
				System.out.println("De Madrugada!!");
			}
		}
		sc.close();
	}
}
