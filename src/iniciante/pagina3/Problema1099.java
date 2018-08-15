package iniciante.pagina3;
import java.util.Scanner;

public class Problema1099{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] vetor=new int[n];
		int x,y,soma,aux;
		for (int i = 0; i < vetor.length; i++) {
			soma=0;
			x=sc.nextInt();
			y=sc.nextInt();
			if(x>y){
				aux=y;
				y=x;
				x=aux;
			}
			for(int j=x+1;j<y;j++){
				if(j%2==1||j%2==-1)soma+=j;
			}
			vetor[i]=soma;
			
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		sc.close();
	}

}