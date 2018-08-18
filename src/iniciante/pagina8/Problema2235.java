package iniciante.pagina8;
import java.util.Scanner;

public class Problema2235 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b || b==c || a==c) {
			System.out.println("S");
		}else {
			if(a==b+c || b==a+c || c==b+a) {
				System.out.println("S");
			}else {
				System.out.println("N");
			}
		}
		sc.close();
	}
}
