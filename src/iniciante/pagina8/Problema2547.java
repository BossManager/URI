package iniciante.pagina8;
import java.util.Scanner;

public class Problema2547 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,amin,amax,alt,cont=0;
		while(sc.hasNextInt()) {
			n=sc.nextInt();
			amin=sc.nextInt();
			amax=sc.nextInt();
			for (int i = 0; i < n; i++) {
				alt=sc.nextInt();
				if(alt>=amin && alt<=amax) {
					cont++;
				}
			}
			System.out.println(cont);
			cont=0;
		}
		sc.close();
	}
}
