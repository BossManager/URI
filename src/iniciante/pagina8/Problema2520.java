package iniciante.pagina8;
import java.util.Scanner;

public class Problema2520 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int x1=0,y1=0,x2=0,y2=0;
			int [][]maze=new int[n][m];
			for (int i = 0; i <n; i++) {
				for (int j = 0; j < m; j++) {
					maze[i][j]=sc.nextInt();
					if(maze[i][j]==2) {
						x1=i;
						y1=j;
					}
					if(maze[i][j]==1) {
						x2=i;
						y2=j;
					}
						
				}
			}
			int cont=0;
			while(x1!=x2 || y1!=y2) {
				if(x1>x2) {
					x2++;
					cont++;
				}
				if(y1>y2) {
					y2++;
					cont++;
				}
				if(x1<x2) {
					x2--;
					cont++;
				}
				if(y1<y2) {
					y2--;
					cont++;
				}
				
			}
			System.out.println(cont);
		}
		sc.close();
	}
}