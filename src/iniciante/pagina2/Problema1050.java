package iniciante.pagina2;

import java.util.Scanner;

public class Problema1050 {
	public static void main(String[] args) {
		// PROBLEMA 1050
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		switch (a) {
		case 61:
			System.out.println("Brasilia");
			break;
		case 71:
			System.out.println("Salvador");
			break;
		case 21:
			System.out.println("Rio de Janeiro");
			break;
		case 11:
			System.out.println("Sao Paulo");
			break;
		case 32:
			System.out.println("Juiz de Fora");
			break;
		case 19:
			System.out.println("Campinas");
			break;
		case 27:
			System.out.println("Vitoria");
			break;
		case 31:
			System.out.println("Bela Horizonte");
			break;
		default:
			System.out.println("DDD nao cadastrado");
		}
		sc.close();
	}
}
