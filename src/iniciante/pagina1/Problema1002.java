package iniciante.pagina1;
import java.util.Locale;
import java.util.Scanner;
public class Problema1002 {
	public final static double PI=3.14159;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada=new Scanner(System.in);
		double raio=entrada.nextDouble();
		double area=PI*raio*raio;
		System.out.printf("A=%.4f\n", area);
		entrada.close();

	}

}