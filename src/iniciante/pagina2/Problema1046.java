package iniciante.pagina2;

import java.util.Scanner;

public class Problema1046 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>=b)b+=24;
		b=b-a;
		System.out.println("O JOGO DUROU "+b+" HORA(S)");
		sc.close();
	}
}
