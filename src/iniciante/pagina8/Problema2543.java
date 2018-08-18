package iniciante.pagina8;
import java.util.Scanner;

public class Problema2543 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,cod,ni,c,cont=0;
		while(sc.hasNextInt()){
			n=sc.nextInt();
			cod=sc.nextInt();
			for (int i = 0; i <n; i++) {
				ni=sc.nextInt();
				c=sc.nextInt();
				if(c==0) {
					if(ni==cod)
						cont++;
				}
			}
			System.out.println(cont);
			cont=0;
		}
		sc.close();
	}
}