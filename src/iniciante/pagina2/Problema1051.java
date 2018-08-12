package iniciante.pagina2;

import java.util.Locale;
import java.util.Scanner;

public class Problema1051 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		float salario = Float.parseFloat(sc.nextLine());
		float imposto = 0;
		float sal = salario;
		if (salario >= 0) {
			if (salario <= 2000)
				System.out.println("Isento");
		}
		if (salario > 2000) {
			if (salario > 3000) {
				imposto = (float) (imposto + 1000 * 0.08);

			} else {
				imposto = (float) (imposto + (salario - 2000) * 0.08);
			}

		}
		if (salario >= 3000.01) {
			if (salario > 4500) {
				imposto = (float) (imposto + 1500 * 0.18);
			} else {
				imposto = (float) (imposto + (salario - 3000) * 0.18);
			}

		}
		if (salario > 4500) {
			salario -= 4500;
			imposto = (float) (imposto + (salario * 0.28));

		}
		if (sal > 2000)
			System.out.printf("R$ %.2f\n", imposto);
		
		sc.close();
	}
}
