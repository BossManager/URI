package iniciante.pagina1;
import java.util.Locale;
import java.util.Scanner;

public class Problema1006 {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada=new Scanner(System.in);
		double a,b,c,media,peso1=2,peso2=3,peso3=5;
		a=entrada.nextDouble();
		b=entrada.nextDouble();
		c=entrada.nextDouble();
		media=((a*peso1)+(b*peso2)+(c*peso3))/(peso1+peso2+peso3);
		System.out.printf("MEDIA = %.1f\n",media);
		entrada.close();
	}

}