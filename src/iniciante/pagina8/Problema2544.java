package iniciante.pagina8;
import java.util.Scanner;

public class Problema2544 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int clones,cont=0;
		while(sc.hasNextInt()) {
			clones=sc.nextInt();
			while(clones!=0) {
				clones/=2;
				cont++;
			}
			System.out.println(cont-1);
			cont=0;
		}
		sc.close();
	}
}
