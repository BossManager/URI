package iniciante.pagina8;
import java.util.Scanner;

public class Problema2551 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,pos=0;
		int [][]treino;
		float max=0;
		while(sc.hasNextInt()) {
			n=sc.nextInt();
			treino=new int[n][2];
			for (int i = 0; i <n; i++) {
				for (int j = 0; j <2; j++) {
					treino[i][j]=sc.nextInt();
				}
				if(i==0) {
					max=treino[i][1]/treino[i][0];
					pos=i;
				}else {
					if(max<treino[i][1]/treino[i][0]) {
						max=treino[i][1]/treino[i][0];
						pos=i;
					}
				}
			}
			System.out.println(1);
			int cont=0;
			for (int i = 1; i < treino.length; i++) {
				for (int j = 0; j < i; j++) {
					if((float)treino[i][1]/treino[i][0]>(float)treino[j][1]/treino[j][0]) {
						cont++;
					}
				}
				if(cont==i) {
					System.out.println(i+1);
				}
				cont=0;
			}
		}
		sc.close();
	}
}