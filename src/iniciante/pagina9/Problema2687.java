package iniciante.pagina9;

import java.util.Locale;
import java.util.Scanner;

public class Problema2687 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int q = sc.nextInt();
		for (int i = 0; i <q; i++) {
			int l = sc.nextInt();
			int matriz[][] = new int[l][l];
			int contsOnes = 0;
			for(int j = 0;j<l;j++) {
				for(int p=0;p<l;p++) {
					matriz[j][p] = sc.nextInt();
					if(matriz[j][p]==1)
						contsOnes++;
				}
			}
			contsOnes += contNucleo(matriz);
			System.out.printf("%.2f\n",(float)contsOnes/2.0);
		}
		sc.close();
	}

	private static int contNucleo(int[][] matriz) {
		int contsZeros = 0;
		for (int f = 1; f < matriz.length-1; f++) {
			for (int i = 1; i < matriz.length-1; i++) {
				if(matriz[f][i]==0) {
					if(matriz[f][i-1]==-1 || matriz[f][i+1]==-1 || matriz[f-1][i]==-1 || matriz[f+1][i]==-1) {
						matriz[f][i] = -1;
						contsZeros++;
						continue;
					}
					if(searchOneUp(matriz,f,i) && searchOneBot(matriz,f,i) && searchOneLeft(matriz,f,i) && searchOneRight(matriz,f,i)) {
						contsZeros++;
						matriz[f][i] = -1;
					}
				}
			}
		}
		return contsZeros;
	}

	private static boolean searchOneUp(int[][] matriz,int i,int j) {
		for(int y = i-1;y>=0;y--) {
			if(matriz[y][j]==1)
				return true;
		}
		return false;
	}

	private static boolean searchOneBot(int[][] matriz,int i,int j) {
		for(int y = i+1;y<matriz.length;y++) {
			if(matriz[y][j]==1)
				return true;
		}
		return false;
	}

	private static boolean searchOneLeft(int[][] matriz,int i,int j) {
		for(int y = j-1;y>=0;y--) {
			if(matriz[i][y]==1)
				return true;
		}
		return false;
	}

	private static boolean searchOneRight(int[][] matriz,int i,int j) {
		for(int y = j+1;y<matriz.length;y++) {
			if(matriz[i][y]==1)
				return true;
		}
		return false;
	}

}
