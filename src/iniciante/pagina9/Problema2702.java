package iniciante.pagina9;

import java.util.Scanner;

public class Problema2702 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c1 = sc.nextInt();
		int b1 = sc.nextInt();
		int p1 = sc.nextInt();
		int c2 = sc.nextInt();
		int b2 = sc.nextInt();
		int p2 = sc.nextInt();
		int result = 0;
		if(c1<c2)
			result += c2-c1;
		if(b1<b2)
			result += b2-b1;
		if(p1<p2)
			result += p2-p1;
		System.out.println(result);
		sc.close();
	}
}
