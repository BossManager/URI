package iniciante.pagina3;
import java.util.Scanner;

public class Problema1145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int o = 0;

		for (int i = 1; i <= y; i++) {
			o++;
			if (o == x) {
				System.out.print(i);
				o = 0;
				System.out.println("");
			} else {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}