package iniciante.pagina2;

import java.util.Scanner;

public class Problema1044 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int min=a,max=b;
		if(a>b){
			max=a;
			min=b;
		}
		if(max%min==0)System.out.println("Sao Multiplos");
		else System.out.println("Nao sao Multiplos");
		sc.close();
	}
}
