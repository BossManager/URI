package iniciante.pagina8;
import java.util.Scanner;

public class Problema2540 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,voto=0,v;
		while(sc.hasNextInt()) {
			n=sc.nextInt();
			for (int i = 0; i < n; i++) {
				v=sc.nextInt();
				if(v==1)
					voto++;
			}
			if((float)voto>=((2.0/3.0)*n))
				System.out.println("impeachment");
			else
				System.out.println("acusacao arquivada");
			voto=0;
		}
		sc.close();
	}
}
