package iniciante.pagina9;

import java.util.Scanner;

public class Problema2663 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int classificados = 0;
		int []vetor = new int[1001];
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<n;i++) {
			int num = sc.nextInt();
			vetor[num]++;
			max = Math.max(max, num);
		}
		for(int j = max;j>0;j--) {
			classificados += vetor[j];
			if(k<=vetor[j])
				break;
			else
				k -= vetor[j];
		}
		System.out.println(classificados);
		sc.close();
	}
}
