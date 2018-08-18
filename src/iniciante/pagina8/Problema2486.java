package iniciante.pagina8;
import java.util.Scanner;

public class Problema2486 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t,q,total;
		String s;
		do {
			t=sc.nextInt();
			if(t==0)
				break;
			total=0;
			for (int i = 0; i <t; i++) {
				q=sc.nextInt();
				s=sc.nextLine();
				total+=vitaminaC(s)*q;				
			}
			if(total>=110 && total<=130) {
				System.out.println(total+" mg");
			}else if(total>130) {
				System.out.println("Menos "+(total-130)+" mg");
			}else {
				System.out.println("Mais "+(110-total)+" mg");
			}
		}while(t!=0);
		sc.close();
	}
	private static int vitaminaC(String alimento) {
		if(alimento.equals(" suco de laranja"))
			return 120;
		if(alimento.equals(" morango fresco"))
			return 85;
		if(alimento.equals(" mamao"))
			return 85;
		if(alimento.equals(" goiaba vermelha"))
			return 70;
		if(alimento.equals(" manga"))
			return 56;
		if(alimento.equals(" laranja"))
			return 50;
		if(alimento.equals(" brocolis"))
			return 34;

		return 0;
	}
}