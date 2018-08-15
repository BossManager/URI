package iniciante.pagina9;

import java.util.Scanner;

public class Problema2674 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLong()) {
			long num = sc.nextLong();
			System.out.println(isSuperOrPrimeOrNothing(num));
		}
		
		sc.close();
	}

	private static String isSuperOrPrimeOrNothing(long num) {
		for(long i = 2;i<num/2;i++) {
			if(num%i==0)
				return "Nada";
		}

		
		while(num!=0) {
			long r = num%10;
			num /=10;
			if(r==2 || r==3 || r==5 || r==7) 
				continue;
			else
				return "Primo";
			
		}
		return "Super";
	}
}
