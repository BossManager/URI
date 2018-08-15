package iniciante.pagina3;
import java.util.Locale;
import java.util.Scanner;

public class Problema1094 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n=Integer.parseInt(sc.nextLine()),quantia,coelho=0,sapo=0,rato=0,total=0;
		char t;
		String[] str;
		for (int i = 0; i < n; i++) {
			str=sc.nextLine().split(" ");
			quantia=Integer.parseInt(str[0]);
			
			if(quantia>=1 && quantia<=15){
				if(str[1].equals("C"))coelho+=quantia;
				if(str[1].equals("S"))sapo+=quantia;
				if(str[1].equals("R"))rato+=quantia;
				total+=quantia;
				
			}
		}
		System.out.println("Total: "+total+" cobaias");
		System.out.println("Total de coelhos: "+coelho);
		System.out.println("Total de ratos: "+rato);
		System.out.println("Total de sapos: "+sapo);
		System.out.printf("Percentual de coelhos: %.2f %%\n",(coelho/(float)total)*100);
		System.out.printf("Percentual de ratos: %.2f %%\n",(rato/(float)total)*100);
		System.out.printf("Percentual de sapos: %.2f %%\n",(sapo/(float)total)*100);
		sc.close();
	}

}