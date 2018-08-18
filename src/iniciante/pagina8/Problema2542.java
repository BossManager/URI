package iniciante.pagina8;
import java.util.Scanner;

public class Problema2542 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m,l,atri,m1,l1;
		int [][]mardeck;
		int [][]leodeck;
		while(sc.hasNextInt()) {
			n=sc.nextInt();
			m=sc.nextInt();
			l=sc.nextInt();
			mardeck=new int[m][n];
			leodeck=new int[l][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					mardeck[i][j]=sc.nextInt();
				}
			}
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < n; j++) {
					leodeck[i][j]=sc.nextInt();
				}
			}
			m1=sc.nextInt();
			l1=sc.nextInt();
			atri=sc.nextInt();
			if(mardeck[m1-1][atri-1]>leodeck[l1-1][atri-1]) {
				System.out.println("Marcos");
			}else if(mardeck[m1-1][atri-1]<leodeck[l1-1][atri-1]) {
				System.out.println("Leonardo");
			}else {
				System.out.println("Empate");
			}
		}
		sc.close();
	}
}