package iniciante.pagina9;

import java.util.Scanner;

public class Problema2690 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		sc = sc.reset();
		sc = new Scanner(System.in);
		for(int i = 0;i<n;i++) {
			String pass = sc.nextLine();
			pass = convertPassword(pass.replaceAll(" ", ""),0);
			System.out.println(pass);
		}
		sc.close();
	}

	private static String convertPassword(String pass,int i) {
		if(i==12 || pass.length()==i)
			return "";
		if(pass.charAt(i)=='G' || pass.charAt(i)=='Q' || pass.charAt(i)=='a' || pass.charAt(i)=='k' || pass.charAt(i)=='u') {
			return "0"+convertPassword(pass, i+1);
		}else if(pass.charAt(i)=='I' || pass.charAt(i)=='S' || pass.charAt(i)=='b' || pass.charAt(i)=='l' || pass.charAt(i)=='v') {
			return "1"+convertPassword(pass, i+1);
		}else if(pass.charAt(i)=='E' || pass.charAt(i)=='O' || pass.charAt(i)=='Y' || pass.charAt(i)=='c' || pass.charAt(i)=='m' || pass.charAt(i)=='w') {
			return "2"+convertPassword(pass, i+1);
		}else if(pass.charAt(i)=='F' || pass.charAt(i)=='P' || pass.charAt(i)=='Z' || pass.charAt(i)=='d' || pass.charAt(i)=='n' || pass.charAt(i)=='z') {
			return "3"+convertPassword(pass, i+1);
		}else if(pass.charAt(i)=='J' || pass.charAt(i)=='T' || pass.charAt(i)=='e' || pass.charAt(i)=='o' || pass.charAt(i)=='y') {
			return "4"+convertPassword(pass, i+1);
		}else if(pass.charAt(i)=='D' || pass.charAt(i)=='N' || pass.charAt(i)=='X' || pass.charAt(i)=='f' || pass.charAt(i)=='p' || pass.charAt(i)=='z') {
			return "5"+convertPassword(pass, i+1);
		}else if(pass.charAt(i)=='A' || pass.charAt(i)=='K' || pass.charAt(i)=='U' || pass.charAt(i)=='g' || pass.charAt(i)=='q') {
			return "6"+convertPassword(pass, i+1);
		}else if(pass.charAt(i)=='C' || pass.charAt(i)=='M' || pass.charAt(i)=='W' || pass.charAt(i)=='h' || pass.charAt(i)=='r') {
			return "7"+convertPassword(pass, i+1);
		}else if(pass.charAt(i)=='B' || pass.charAt(i)=='L' || pass.charAt(i)=='V' || pass.charAt(i)=='i' || pass.charAt(i)=='s') {
			return "8"+convertPassword(pass, i+1);
		}else if(pass.charAt(i)=='H' || pass.charAt(i)=='R' || pass.charAt(i)=='j' || pass.charAt(i)=='t') {
			return "9"+convertPassword(pass, i+1);
		}else {
			return "";
		}
		
	}

}
