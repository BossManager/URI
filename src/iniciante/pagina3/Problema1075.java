package iniciante.pagina3;
import java.util.Scanner;

public class Problema1075 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<10000){
			for(int i=1;i<10000;i++){
				if(i%n==2)System.out.println(i);
			}
		}
		sc.close();
	}

}
