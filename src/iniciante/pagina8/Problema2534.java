package iniciante.pagina8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problema2534 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,q;
		int []v2;
		List v1=new ArrayList<Integer>();
		while(sc.hasNextInt()) {
			n=sc.nextInt();
			q=sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				v1.add(sc.nextInt());
			}
			v1.sort(null);
			Collections.reverse(v1);
			v2=new int[q];
			for (int i = 0; i < q; i++) {
				v2[i]=sc.nextInt();
				System.out.println(v1.get(v2[i]-1));
			}
			v1.removeAll(v1);
		}
		sc.close();
	}
}
