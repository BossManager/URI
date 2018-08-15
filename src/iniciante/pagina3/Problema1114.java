package iniciante.pagina3;

import java.io.IOException;
import java.util.*;

public class Problema1114 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int senha = 2002, n;
		while ((n = sc.nextInt()) != senha) {
			System.out.println("Senha Invalida");
		}
		System.out.println("Acesso Permitido");
		sc.close();
	}

}