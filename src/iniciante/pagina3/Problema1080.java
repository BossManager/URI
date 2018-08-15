package iniciante.pagina3;
import java.util.Scanner;

public class Problema1080 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max=0,pos=0;
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < 100; i++) {
			int n=sc.nextInt();
			if(max<n){
				max=n;
				pos=i+1;
			}
		}
		System.out.println(max+"\n"+pos);
		sc.close();
	}

}