package iniciante.pagina3;
import java.util.Locale;
import java.util.Scanner;

public class Problema1079 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n=Integer.parseInt(sc.nextLine());
		float[] vetor=new float[n];
		int pv1=2,pv2=3,pv3=5;
		float num1,num2,num3,media;
		String[] str;
		
		
		for (int i = 0; i < n; i++) {
			str=sc.nextLine().split(" ");
			media=0;
			num1=Float.parseFloat(str[0]);
			num2=Float.parseFloat(str[1]);
			num3=Float.parseFloat(str[2]);
			media=(num1*pv1+num2*pv2+num3*pv3)/10;
			vetor[i]=media;
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f\n",vetor[i]);
		}
		sc.close();
	}

}