package iniciante.pagina2;

import java.util.Scanner;

public class Problema1042 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] vetor=new int[3];
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		vetor[0]=a;
		vetor[1]=b;
		vetor[2]=c;
		for(int i=0;i<vetor.length;i++){
			for(int j=0;j<vetor.length-1;j++){
				if(vetor[j]>vetor[j+1]){
					int o=vetor[j+1];
					vetor[j+1]=vetor[j];
					vetor[j]=o;
				}
			}
		}
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]+"\n");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();
	}
}
