package iniciante.pagina1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1021 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		float x=Float.parseFloat(sc.nextLine());
		int num100=0,num50=0,num20=0,num10=0,num5=0,num2=0,num1=0;
		int moeda50=0,moeda25=0,moeda10=0,moeda5=0,moeda1=0;
		if(x>0 && x<1000000){
			float n=x;
			while(n>=100){
				n-=100;
				num100++;
			}
			while(n>=50){
				n-=50;
				num50++;
			}
			while(n>=20){
				n-=20;
				num20++;
			}
			while(n>=10){
				n-=10;
				num10++;
			}
			while(n>=5){
				n-=5;
				num5++;
			}
			while(n>=2){
				n-=2;
				num2++;
			}
			while(n>=1){
				n-=1;
				num1++;
			}
			while(n>=0.50){
				
				n-=0.5;
				moeda50++;
			}
			while(n>=0.25){
				
				n-=0.25;
				moeda25++;
			}
			while(n>=0.10){
				
				n-=0.1;
				moeda10++;
			}
			while(n>=0.05){
				
				n-=0.05;
				moeda5++;
			}
			while(n>0.01){
				n-=0.01;
				moeda1++;
			}
			if(n>0.009)moeda1++;
		}
		System.out.println("NOTAS:");
		System.out.println(num100+" nota(s) de R$ 100.00");
		System.out.println(num50+" nota(s) de R$ 50.00");
		System.out.println(num20+" nota(s) de R$ 20.00");
		System.out.println(num10+" nota(s) de R$ 10.00");
		System.out.println(num5+" nota(s) de R$ 5.00");
		System.out.println(num2+" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(num1+" moeda(s) de R$ 1.00");
		System.out.println(moeda50+" moeda(s) de R$ 0.50");
		System.out.println(moeda25+" moeda(s) de R$ 0.25");
		System.out.println(moeda10+" moeda(s) de R$ 0.10");
		System.out.println(moeda5+" moeda(s) de R$ 0.05");
		System.out.println(moeda1+" moeda(s) de R$ 0.01");
		sc.close();

	}
}
