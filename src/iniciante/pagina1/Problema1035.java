package iniciante.pagina1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1035 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if(b>c && d>a){
			if(c+d>b+a){
				if(c>0 && d>0){
					if(a%2==0){
						System.out.println("Valores aceitos");
					}else{
						System.out.println("Valores nao aceitos");
					}
				}else{
					System.out.println("Valores nao aceitos");
				}
			}else{
				System.out.println("Valores nao aceitos");
			}
		}else{
			System.out.println("Valores nao aceitos");
		}
		sc.close();

	}
}
