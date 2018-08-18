package iniciante.pagina8;
import java.util.Scanner;

public class Problema2311 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String j;
		double dificult,max,min,total=0;
		double []n=new double[7];
		for (int i = 0; i < a; i++) {
			total=0;
			j=sc.next();
			dificult=sc.nextDouble();
			n[0]=sc.nextDouble();
			max=n[0];
			min=n[0];
			n[1]=sc.nextDouble();
			n[2]=sc.nextDouble();
			n[3]=sc.nextDouble();
			n[4]=sc.nextDouble();
			n[5]=sc.nextDouble();
			n[6]=sc.nextDouble();
			for (int k = 0; k < n.length; k++) {
				if(max<n[k])
					max=n[k];
				if(min>n[k])
					min=n[k];
				total+=n[k];
			}
			total=total-max-min;
			total*=dificult;
			System.out.printf(j+" %.2f\n",total);
		}
		sc.close();
	}
}