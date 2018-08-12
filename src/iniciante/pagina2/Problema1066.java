package iniciante.pagina2;

import java.util.Scanner;

public class Problema1066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int par = 0, impar = 0, positivo = 0, negativo = 0;
		//
		int n1 = sc.nextInt();
		if (n1 % 2 == 0)
			par++;
		else
			impar++;
		if (n1 > 0)
			positivo++;
		if (n1 < 0)
			negativo++;
		//
		int n2 = sc.nextInt();
		if (n2 % 2 == 0)
			par++;
		else
			impar++;
		if (n2 > 0)
			positivo++;
		if (n2 < 0)
			negativo++;
		//
		int n3 = sc.nextInt();
		if (n3 % 2 == 0)
			par++;
		else
			impar++;
		if (n3 > 0)
			positivo++;
		if (n3 < 0)
			negativo++;
		//
		int n4 = sc.nextInt();
		if (n4 % 2 == 0)
			par++;
		else
			impar++;
		if (n4 > 0)
			positivo++;
		if (n4 < 0)
			negativo++;
		//
		int n5 = sc.nextInt();
		if (n5 % 2 == 0)
			par++;
		else
			impar++;
		if (n5 > 0)
			positivo++;
		if (n5 < 0)
			negativo++;

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		sc.close();
	}
}
