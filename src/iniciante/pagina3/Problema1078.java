package iniciante.pagina3;
import java.util.Scanner;

public class Problema1078{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>2 && n<1000){
			for (int i = 1; i <= 10; i++) {
				System.out.println(i+" x "+n+" = "+(n*i));
			}
		}
		sc.close();
	}

}