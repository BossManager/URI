package iniciante.pagina2;

import java.util.Locale;
import java.util.Scanner;

public class Problema1040 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Locale.setDefault(Locale.US);
		float n1=sc.nextFloat();
		float n2=sc.nextFloat();
		float n3=sc.nextFloat();
		float n4=sc.nextFloat();
		float media=(n1*2+n2*3+n3*4+n4)/(4+3+2+1);
		System.out.printf("Media: %.1f\n",media);
		if(media>=7.0) {
			System.out.println("Aluno aprovado.");
		}else if(media<5.0) {
			System.out.println("Aluno reprovado.");
		}else {
			System.out.println("Aluno em exame.");
			float nexame=sc.nextFloat();
			System.out.printf("Nota do exame: %.1f\n",nexame);
			media=(media+nexame)/2;
			if(media>=5.0) {
				System.out.println("Aluno aprovado.");
			}else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n",media);
		}
		sc.close();
		
	}
}
