package iniciante.pagina2;

import java.util.Locale;
import java.util.Scanner;

public class Problema1045 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String[] str;
		str=sc.nextLine().split(" ");
		double x=Double.parseDouble(str[0]);
		double y=Double.parseDouble(str[1]);
		double z=Double.parseDouble(str[2]);
		double[] vetor=new double[3];
		vetor[0]=x;
		vetor[1]=y;
		vetor[2]=z;
		for(int i=0;i<vetor.length;i++){
			for(int j=0;j<vetor.length-1;j++){
				if(vetor[j]<vetor[j+1]){
					double o=vetor[j+1];
					vetor[j+1]=vetor[j];
					vetor[j]=o;
				}
			}
		}
		x=vetor[0];
		y=vetor[1];
		z=vetor[2];
		if(x>0 && y>0 && z>0){
			if(x>=y+z){
				System.out.println("NAO FORMA TRIANGULO");
			}else{
				if(Math.pow(x, 2)==(Math.pow(y, 2)+Math.pow(z, 2)))System.out.println("TRIANGULO RETANGULO");
				if(Math.pow(x, 2)>(Math.pow(y, 2)+Math.pow(z, 2)))System.out.println("TRIANGULO OBTUSANGULO");
				if(Math.pow(x, 2)<(Math.pow(y, 2)+Math.pow(z, 2)))System.out.println("TRIANGULO ACUTANGULO");
				if(x==y && y==z)System.out.println("TRIANGULO EQUILATERO");
				if((x==y && x!=z)||(y==z && y!=x)||(x==z && z!=y))System.out.println("TRIANGULO ISOSCELES");
			}
		}
		sc.close();
	}
}
