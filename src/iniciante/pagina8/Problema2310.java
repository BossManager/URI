package iniciante.pagina8;
import java.util.Scanner;

public class Problema2310 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String j;
		int quantS,quantB,quantA,suceS,suceB,suceA;
		int totalS = 0,totalB = 0,totalA = 0,totalSuceS = 0,totalSuceB = 0,totalSuceA = 0;
		for (int i = 0; i < a; i++) {
			j=sc.next();
			quantS=sc.nextInt();
			quantB=sc.nextInt();
			quantA=sc.nextInt();
			suceS=sc.nextInt();
			suceB=sc.nextInt();
			suceA=sc.nextInt();
			totalS+=quantS;
			totalB+=quantB;
			totalA+=quantA;
			totalSuceS+=suceS;
			totalSuceB+=suceB;
			totalSuceA+=suceA;
		}
		System.out.printf("Pontos de Saque: %.2f %%.\n",(float)totalSuceS/totalS*100);
		System.out.printf("Pontos de Bloqueio: %.2f %%.\n",(float)totalSuceB/totalB*100);
		System.out.printf("Pontos de Ataque: %.2f %%.\n",(float)totalSuceA/totalA*100);
		sc.close();
	}
}