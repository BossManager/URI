package iniciante.pagina3;
public class Problema1096 {
 
    public static void main(String[] args){
 
        int n=7;
		for(int i=1;i<=9;i+=2){
			System.out.println("I="+i+" J="+n);
			System.out.println("I="+i+" J="+(n-1));
			System.out.println("I="+i+" J="+(n-2));
			n=7;
		}
    }
 
}