package iniciante.pagina3;
import java.util.Scanner;

public class Problema1131 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nv,inter,gremio;
		int iganhou=0;
		int gganhou=0;
		int empate=0;
		int grenais=0;
		do{
			inter=sc.nextInt();
			gremio=sc.nextInt();
			if(inter>gremio)iganhou++;
			if(gremio>inter)gganhou++;
			if(inter==gremio)empate++;
			do{
				System.out.println("Novo grenal (1-sim 2-nao)");
				nv=sc.nextInt();
			}while(nv!=1 && nv!=2);
			grenais++;
		}while(nv==1);
		System.out.println(grenais+" grenais");
		System.out.println("Inter:"+iganhou);
		System.out.println("Gremio:"+gganhou);
		System.out.println("Empates:"+empate);
		if(iganhou>gganhou)System.out.println("Inter venceu mais");
		if(iganhou<gganhou)System.out.println("Gremio venceu mais");
		if(iganhou==gganhou)System.out.println("Nao houve vencedor");
	}

}