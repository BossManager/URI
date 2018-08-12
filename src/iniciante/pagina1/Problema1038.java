package iniciante.pagina1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1038 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int x=sc.nextInt();
		int y=sc.nextInt();
		float prod=0;
		switch(x){
			case 5:
				prod+=1.5;
				break;
			case 4:
				prod+=2;
				break;
			case 3:
				prod+=5;
				break;
			case 2:
				prod+=4.5;
				break;
			case 1:
				prod+=4;
				break;
		}
		System.out.printf("Total: R$ %.2f\n",prod*y);
		sc.close();
	}
}
