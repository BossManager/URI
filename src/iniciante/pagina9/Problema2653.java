package iniciante.pagina9;

import java.util.HashMap;
import java.util.Scanner;

public class Problema2653 {
	public static void main(String[] args) {
		HashMap<String,Integer> joias = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String joia = sc.next();
			joias.put(joia, 0);
		}
		System.out.println(joias.size());
	}
}
