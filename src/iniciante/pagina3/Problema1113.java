package iniciante.pagina3;
import java.util.Scanner;

public class Problema1113 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int x,y;
		
		while((x=sc.nextInt())!=( y=sc.nextInt())){
			if(x>y)System.out.println("Decrescente");
			else System.out.println("Crescente");
		}
		sc.close();
	}

}