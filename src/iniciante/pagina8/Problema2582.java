package iniciante.pagina8;
import java.util.Scanner;

public class Problema2582 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,b;
		for (int i = 0; i < n; i++) {
			a=sc.nextInt();
			b=sc.nextInt();
			a+=b;
			if(a==0) {
				System.out.println("PROXYCITY");
			}else if(a==1) {
				System.out.println("P.Y.N.G.");
			}else if(a==2) {
				System.out.println("DNSUEY!");
			}else if(a==3) {
				System.out.println("SERVERS");
			}else if(a==4) {
				System.out.println("HOST!");
			}else if(a==5) {
				System.out.println("CRIPTONIZE");
			}else if(a==6) {
				System.out.println("OFFLINE DAY");
			}else if(a==7) {
				System.out.println("SALT");
			}else if(a==8) {
				System.out.println("ANSWER!");
			}else if(a==9) {
				System.out.println("RAR?");
			}else if(a==10) {
				System.out.println("WIFI ANTENNAS");
			}
		}
		sc.close();
	}
}