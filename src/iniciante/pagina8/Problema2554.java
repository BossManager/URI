package iniciante.pagina8;
import java.util.Scanner;

public class Problema2554 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m,assido,cont=0;
		String data = null,that = null;
		boolean flag=false;
		while(sc.hasNextInt()) {
			n=sc.nextInt();
			m=sc.nextInt();
			for (int i = 0; i <m; i++) {
				data=sc.next();
				for (int j = 0; j < n; j++) {
					assido=sc.nextInt();
					if(assido==1) {
						cont++;
					}
				}
				if(cont==n) {
					if(!flag)that=data;
					flag=true;
				}
				cont=0;
			}
			if(flag) {
				System.out.println(that);
			}else {
				System.out.println("Pizza antes de FdI");
			}
			flag=false;
		}
		sc.close();
	}
}