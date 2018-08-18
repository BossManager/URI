package iniciante.pagina9;

import java.util.Scanner;

public class Problema2689 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		for(int l = 0;l<p;l++) {
			int matriz[][] = new int[3][3];
			int dif[][] = new int[3][3];
			int difs[] = new int[101];
			//preenchimento do grid, das diferenças e conta da q mais se repete
			for(int i = 0;i<3;i++) {
				for(int j = 0;j<3;j++) {
					matriz[i][j] = sc.nextInt();
					if(j>0) {
						dif[i][j] = Math.abs(matriz[i][j]-matriz[i][j-1]);
						difs[dif[i][j]]++;
					}
				}
				dif[i][0] = Math.abs(matriz[i][0]-matriz[i][1]);
				difs[dif[i][0]]++;
			}
			
			//achar a diferença que mais se repete
			int max = Integer.MIN_VALUE;
			int index = 0;
			for (int i = 0; i < difs.length; i++) {
				if(max<difs[i]) {
					max = difs[i];
					index = i;
				}
			}
			int cont = 0;
			int diferenca = index;
			int index1 = -1,index2 = -1, index3 = -1;
			for(int i = 0;i<3;i++) {
				if(dif[i][0]==diferenca) {
					index1 = 0 ;
					index2 = 1;
				}
				if(dif[i][2]==diferenca) {
					index2 = 1;
					index3 = 2;
				}
				if(Math.abs(matriz[i][0]-matriz[i][2])==diferenca) {
					index1 = 0;
					index3 = 2;
				}
				if(index1!=-1) {
					matriz[i][0] = 100;
					cont++;
				}
				if(index2!=-1) {
					matriz[i][1] = 100;
					cont++;
				}
				if(index3!=-1) {
					matriz[i][2] = 100;
					cont++;
				}
				index1=index2=index3=-1;
			}
			cont=9-cont;
			System.out.print("Possiveis maletas:");
			for(int i = 0;i<3;i++) {
				for(int j = 0;j<3;j++) {
					if(matriz[i][j]!=100) {
						System.out.print(" "+matriz[i][j]);
						cont--;
						if(cont>0)
							System.out.print(",");
						
					}
					
				}
			}
			System.out.println(";");
		}
		sc.close();
	}
}
