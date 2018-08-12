package iniciante.pagina2;

import java.util.Scanner;

public class Problema1074 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		int i = 0, a;
		if (n < 10000) {
			for (i = 0; i < n; i++) {
				a = sc.nextInt();
				if (Math.pow(-10, 7) < a && a < Math.pow(10, 7)) {
					String str2 = "";
					if (a == 0) {
						str[i] = "NULL";
					} else {
						if (a % 2 == 0)
							str2 += "EVEN";
						else if (a % 2 == -1 || a % 2 == 1)
							str2 += "ODD";
						str2 += " ";
						if (a > 0)
							str2 += "POSITIVE";
						else
							str2 += "NEGATIVE";
						str[i] = str2;
					}

				}
			}
		}
		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]);
		}
		sc.close();
	}
}
