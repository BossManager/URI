package iniciante.pagina3;
import java.util.Locale;
import java.util.Scanner;

public class Problema1117 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		float n1,n2;
		do{
			n1=Float.parseFloat(sc.nextLine().trim());
			if(n1<0 || n1>10)System.out.println("nota invalida");
		}while(n1<0 || n1>10);
		do{
			n2=Float.parseFloat(sc.nextLine().trim());
			if(n2<0 || n2>10)System.out.println("nota invalida");
		}while(n2<0 || n2>10);
		System.out.printf("media = %.2f\n",(((float)n1)+n2)/2);
		sc.close();
	}

}