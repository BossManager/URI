package iniciante.pagina9;

import java.util.Scanner;

public class Problema2670 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ab  = a*4+b*2;
		int ac  = a*2+c*2;
		int bc  = b*2+c*4;
		System.out.println(Math.min(Math.min(ac, bc),Math.min(ab, ac)));
		sc.close();
	}
}
