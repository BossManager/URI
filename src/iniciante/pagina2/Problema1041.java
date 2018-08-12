package iniciante.pagina2;

import java.util.Locale;
import java.util.Scanner;

public class Problema1041 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String[] str;
		str=sc.nextLine().split(" ");
		float x=Float.parseFloat(str[0]);
		float y=Float.parseFloat(str[1]);
		if(x>0 && y>0)System.out.println("Q1");
		else if(x<0 && y>0)System.out.println("Q2");
		else if(x<0 && y<0)System.out.println("Q3");
		else if(x>0 && y<0)System.out.println("Q4");
		else if(x==0 && y==0)System.out.println("Origem");
		else if(x!=0 && y==0)System.out.println("Eixo X");
		else if(y!=0 && x==0)System.out.println("Eixo Y");
			
		sc.close();
	}
}
