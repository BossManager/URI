package iniciante.pagina3;
import java.util.Scanner;

public class Problema1132 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>y){
			int aux=y;
			y=x;
			x=aux;
		}
		int soma=0;
		for (int i = x; i <= y; i++) {
			if(i%13!=0) soma+=i;
		}
		System.out.println(soma);
		sc.close();
	}

}