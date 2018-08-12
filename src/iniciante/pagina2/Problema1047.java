package iniciante.pagina2;

import java.util.Scanner;

public class Problema1047 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hora_inicial=sc.nextInt();
		int minuto_inicial=sc.nextInt();
		int hora_final=sc.nextInt();
		int minuto_final=sc.nextInt();
		int hora_total,minuto_total;
		hora_total=hora_final-hora_inicial;

		    if (hora_total < 0){
		        hora_total = 24 + (hora_final - hora_inicial);
		    }

		 minuto_total=minuto_final-minuto_inicial;
		 if (minuto_total < 0){
		   minuto_total = 60 + (minuto_final-minuto_inicial);
		   hora_total--;
		  }
		 
		if(hora_inicial==hora_final && minuto_inicial==minuto_final){
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}else{
			System.out.println("O JOGO DUROU "+hora_total+" HORA(S) E "+minuto_total+" MINUTO(S)");			
		}
		sc.close();

	}
}
