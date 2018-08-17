package iniciante.pagina9;

import java.util.Scanner;

public class Problema2674 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int num = sc.nextInt();
			if(!isPrime(num)) {
				System.out.println("Nada\n");
			}else {
				if(isSuperPrime(num))
					System.out.println("Super\n");
				else
					System.out.println("Primo\n");
			}
		}
		
		sc.close();
	}
	static boolean isPrime(int n)
	{
	    if(n==0||n==1)return false;
	    if(n==2) return true;
	    if(n%2==0)return false;
	    for(int i=3;i<=Math.sqrt(n);i+=2)
	    {
	        if(n%i==0)return false;
	    }
	    return true;
	}
	static boolean isSuperPrime(int n)
	{
	    while(n>=10)
	    {
	        int s=n%10;
	        n/=10;
	        if(!isPrime(s))
	            return false;
	    }
	    if(n==2||n==3||n==7||n==5)return true;
	    else return false;
	}
	
}
