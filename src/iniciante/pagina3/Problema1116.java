package iniciante.pagina3;
import java.util.Locale;
import java.util.Scanner;

public class Problema1116 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n=sc.nextInt();
		int y=0;
		int x=0;
		for (int i = 0; i <n; i++) {
			x=sc.nextInt();
			y=sc.nextInt();
			if(y==0)System.out.print("divisao impossivel");
			else if(x==0) System.out.print("0.0");
			else System.out.printf("%.1f",(float)x/y);
			System.out.println();
		}
		sc.close();
	}

}