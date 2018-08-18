package iniciante.pagina8;
import java.util.Scanner;

public class Problema2552 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m,cont=0;
		int [][]tab;
		while(sc.hasNextInt()) {
			n=sc.nextInt();
			m=sc.nextInt();
			tab=new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					tab[i][j]=sc.nextInt();
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if(tab[i][j]==0) {
						if(i+1<n && tab[i+1][j]==1) {
							cont++;
						}
						if(i-1>=0 && tab[i-1][j]==1) {
							cont++;
						}
						if(j+1<m && tab[i][j+1]==1) {
							cont++;
						}
						if(j-1>=0 && tab[i][j-1]==1) {
							cont++;
						}
						System.out.print(cont);
					}else {
						System.out.print(9);
					}
					cont=0;
				}
				System.out.println();
			}
		}
		sc.close();
	}
}