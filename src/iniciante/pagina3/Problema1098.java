package iniciante.pagina3;

import java.util.*;

public class Problema1098 {

	public static void main(String[] args) {

		float n = 1;
		Locale.setDefault(Locale.US);
		int val1 = 0;
		for (float i = (float) 0; i < 2.2; i += 0.2) {
			n += i;
			if (val1 == 0) {
				System.out.printf("I=%.0f J=%.0f\n", i, n);
				System.out.printf("I=%.0f J=%.0f\n", i, (++n));
				System.out.printf("I=%.0f J=%.0f\n", i, (++n));
			} else {
				System.out.printf("I=%.1f J=%.1f\n", i, n);
				System.out.printf("I=%.1f J=%.1f\n", i, (++n));
				System.out.printf("I=%.1f J=%.1f\n", i, (++n));
			}
			val1++;
			if (val1 == 5) {
				val1 = 0;
			}
			n = 1;
		}

	}

}