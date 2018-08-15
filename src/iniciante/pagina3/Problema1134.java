package iniciante.pagina3;
import java.util.Scanner;

public class Problema1134 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int gas,dis,alc;
		gas=dis=alc=0;
		int op;
		do{
			do{
				op=sc.nextInt();
			}while(op<1 || op >4);
			if(op==1)alc++;
			if(op==2)gas++;
			if(op==3)dis++;
		}while(op!=4);
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alc);
		System.out.println("Gasolina: "+gas);
		System.out.println("Diesel: "+dis);
		sc.close();
	}

}