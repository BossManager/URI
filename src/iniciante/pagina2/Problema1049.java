package iniciante.pagina2;

import java.util.Scanner;

public class Problema1049 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1, str2, str3;
		str1 = sc.nextLine().trim();
		str2 = sc.nextLine().trim();
		str3 = sc.nextLine().trim();
		if (str1.equals("vertebrado")) {
			if (str2.equals("ave")) {
				if (str3.equals("carnivoro")) {
					System.out.println("aguia");
				} else if (str3.equals("onivoro")) {
					System.out.println("pomba");
				}
			} else if (str2.equals("mamifero")) {
				if (str3.equals("herbivoro")) {
					System.out.println("vaca");
				} else if (str3.equals("onivoro")) {
					System.out.println("homem");
				}
			}
		} else if (str1.equals("invertebrado")) {
			if (str2.equals("inseto")) {
				if (str3.equals("hematofago")) {
					System.out.println("pulga");
				} else if (str3.equals("herbivoro")) {
					System.out.println("lagarta");
				}
			} else if (str2.equals("anelideo")) {
				if (str3.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else if (str3.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}
		sc.close();
	}
}
