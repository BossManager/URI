package iniciante.pagina1;

import java.util.Scanner;

public class Problema1013 {
	public static void main(String[] args) {
		Scanner et=new Scanner(System.in);
		int a,b,c,maiorAB,maiorBC,maiorABC;
		
		a=et.nextInt();
		b=et.nextInt();
		c=et.nextInt();
		
		maiorAB=(a+b+Math.abs(a-b))/2;
		maiorBC=(b+c+Math.abs(b-c))/2;
		maiorABC=(maiorAB+maiorBC+Math.abs(maiorAB-maiorBC))/2;
		System.out.println(maiorABC+" eh o maior");
		et.close();
	}
}
