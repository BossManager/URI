package iniciante.pagina8;
import java.util.Scanner;

public class Problema2313 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long max,mb,mc;
		boolean iso=false;
		if(Math.abs(b-c)<a && a<(b+c) && Math.abs(a-c)<b && b<(a+c) && Math.abs(a-b)<c && c<(a+b)) {
			if(a==b && b==c) {
				System.out.println("Valido-Equilatero");
			}else if(a!=b && b!=c && a!=c) {
				iso=true;
				System.out.println("Valido-Escaleno");
			}else {
				iso=true;
				System.out.println("Valido-Isoceles");
			}
			
			if(a>=b && b>=c) {
				max=a;
				mb=b;
				mc=c;
			}else if(b>=a && a>=c) {
				max=b;
				mb=a;
				mc=c;
			}else {
				max=c;
				mb=a;
				mc=b;
			}
			if(iso)
				System.out.println("Retangulo: "+(((max*max)==(mb*mb)+(mc*mc))?"S":"N"));
			else 
				System.out.println("Retangulo: N");
		}else {
			System.out.println("Invalido");
		}
		sc.close();
	}
}