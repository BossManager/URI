package iniciante.pagina9;

import java.util.Scanner;

/**
 *
 * @author danen
 */
public class Problema2636 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        while(true){
            n = sc.nextLong();
            
            if(n==0) break;
            System.out.print(n);
            int numbers[] = new int[3];
            int cont = 0;
            int i = 2;
            while(true) {
            	if(isPrime(i)) {
            		if(n%i==0) {
            			n /= i;
            			numbers[cont++] = i;            			
            		}
            		if(n==1)
            			break;
            	}
            	i++;
            }
            System.out.println(" = "+numbers[0]+" x "+numbers[1]+" x "+numbers[2]);
        }
    }

    private static boolean isPrime(int i) {
       if(i==1 || i==0 || (i!=2 && i%2==0) || i%3==0)
    	   return false;
       if(i==3)
    	   return true;
       if(i==2)
    	   return true;
       int o = 5;
       int w = 2;
       while(o*o<=i) {
    	   if(i%o==0)
    		   return false;
    	   i+=w;
    	   w = 6-w;
       }
       
       return true;
    }
}