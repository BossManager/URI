package iniciante.pagina8;
import java.util.Scanner;

public class Problema2523 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char []alfabeto;
		int n;
		int []l;
		while(sc.hasNext()) {
			alfabeto=sc.next().toCharArray();
			n=sc.nextInt();
			l=new int[n];
			for (int i = 0; i < n; i++) {
				l[i]=sc.nextInt();
			}
			for (int i = 0; i < l.length; i++) {
				System.out.print(alfabeto[l[i]-1]);
			}
			System.out.println("");
		}
		sc.close();
	}
}
