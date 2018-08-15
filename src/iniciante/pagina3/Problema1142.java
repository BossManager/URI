package iniciante.pagina3;
import java.util.Scanner;

public class Problema1142 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=1;
		for (int i = 0; i < n; i++) {
			System.out.println((x++)+" "+(x++)+" "+x+" PUM");
			x+=2;
		}
		sc.close();
	}

}