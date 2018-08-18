package iniciante.pagina8;
import java.util.Scanner;

public class Problema2510 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String n;
		for (int i = 0; i < t; i++) {
			n=sc.next();
			if(n.equals("batmain"))
				System.out.println("N");
			else 
				System.out.println("Y");
		}
		sc.close();
	}
}
