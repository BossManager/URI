package iniciante.pagina8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problema2496 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t,x,p;
		String yz,nome,op;
		String []operacoes;
		String []jogadas;
		while(sc.hasNextInt()) {
			t=sc.nextInt();
			operacoes=new String[t];
			jogadas=new String[t];
			for (int i = 0; i < t; i++) {
				x=sc.nextInt();
				yz=sc.next();
				operacoes[i]=x+" "+yz;
			}
			int cont=0;
			for (int i = 0; i < t; i++) {
				nome=sc.next();
				p=sc.nextInt();
				op=sc.next();
				jogadas[i]=nome;
				if(winner(op,operacoes[p-1])) {
					jogadas[i]="";
					cont++;
				}
			}
			if(cont==jogadas.length) {
				System.out.println("You Shall All Pass!");
			}else if(cont==0) {
				System.out.println("None Shall Pass!");
			}else {
				List list = Arrays.asList(jogadas);
				Collections.sort(list);
				int o=0;
				for (Object name:list) {
					if(!name.equals("")) {
						o++;
					}
				}
				int u=1;
				for (Object name:list) {
					if(!name.equals("")) {
						if(u!=o)System.out.print(name+" ");
						else System.out.print(name);
						if(!name.equals(""))u++;
					}
				}
				System.out.println("");
			}
		}
		sc.close();
	}

	private static boolean winner(String string, String string2) {
		
		String []m=string2.split(" ");
		String []m1=m[1].split("=");
		int x=Integer.parseInt(m[0]);
		int y=Integer.parseInt(m1[0]);
		int z=Integer.parseInt(m1[1]);
		if(string.equals("+")) {
			if(x+y==z)
				return true;
		}else if(string.equals("-")) {
			if(x-y==z)
				return true;
		}else if(string.equals("*")){
			if(x*y==z)
				return true;
		}else {
			if(x+y==z) {
				return false;
			}
			if(x-y==z) {
				return false;
			}
			if(x*y==z) {
				return false;
			}
			return true;
		}
		return false;
	}

	
}