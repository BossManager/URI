package iniciante.pagina8;
import java.util.Scanner;

public class Problema2533 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m,c;
		int soma1=0,soma2=0;
		while(sc.hasNextInt()){
			n=sc.nextInt();
			for (int i = 0; i < n; i++) {
				m=sc.nextInt();
				c=sc.nextInt();
				soma1+=m*c;
				soma2+=c;
				
			}
			soma2*=100;
			System.out.printf("%.4f\n",(float)soma1/soma2);
			soma1=0;
			soma2=0;
		}
		sc.close();
	}
}
