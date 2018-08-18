package iniciante.pagina8;
import java.math.BigInteger;
import java.util.Scanner;

public class Problema2334 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigInteger a;
		do {
			a=sc.nextBigInteger();
			if(a.equals(new BigInteger("-1")))
				break;
			if(a.equals(new BigInteger("0"))) {
				System.out.println(0);
			}else {
				System.out.println(a.subtract(new BigInteger("1")));
			}
		}while(!(a==new BigInteger("-1")));
		sc.close();
	}
}
