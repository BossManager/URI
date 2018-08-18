package iniciante.pagina9;

import java.util.Scanner;

public class Problema2634 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<T;i++) {
			int w = Integer.parseInt(sc.nextLine());
			int y = Integer.parseInt(sc.nextLine());
			int n = Integer.parseInt(sc.nextLine());
			int matriz[][] = new int[n][4];
			for (int j = 0; j < n; j++) {
				for(int k = 0; k < 4; k++) {
					matriz[j][k] = Integer.parseInt(sc.nextLine());
				}
			}
			int m = Integer.parseInt(sc.nextLine());
			
			for (int j = 0; j <m; j++) {
				String instruction = sc.nextLine();
			}
		}
	}
}
