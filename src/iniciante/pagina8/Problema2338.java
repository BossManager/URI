package iniciante.pagina8;
import java.util.Scanner;

/**
 *
 * @author danen
 */
public class Problema2338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        String msg;
        for (int i = 0; i < t; i++) {
            msg = sc.next();
            msg = msg.replace('.', '!');
            String palavras[] = msg.split("!!!!!!!");
            for(int j = 0;j<palavras.length;j++){
                String letras[] = palavras[j].split("!!!");
                for(String c:letras){
                    System.out.print(MorseTranslate(c));
                }
                if(j!=palavras.length-1)System.out.print(" ");
            }
                
            System.out.println("");
        }
        sc.close();
        
    }
    private static char MorseTranslate(String l){
        switch(l){
            case "=!===":
                return 'a';
            case "===!=!=!=":
                return 'b';
           case "===!=!===!=":
                return 'c';
            case "===!=!=":
                return 'd';
            case "=":
                return 'e';
            case "=!=!===!=":
                return 'f';
            case "===!===!=":
                return 'g';
            case "=!=!=!=":
                return 'h';
            case "=!=":
                return 'i';
            case "=!===!===!===":
                return 'j';
           case "===!=!===":
                return 'k';
            case "=!===!=!=":
                return 'l';
            case "===!===":
                return 'm';
            case "===!=":
                return 'n';
            case "===!===!===":
                return 'o';
            case "=!===!===!=":
                return 'p';
            case "===!===!=!===":
                return 'q';
            case "=!===!=":
                return 'r';
            case "=!=!=":
                return 's';
            case "===":
                return 't';
            case "=!=!===":
                return 'u';
            case "=!=!=!===":
                return 'v';
            case "=!===!===":
                return 'w';
            case "===!=!=!===":
                return 'x';
            case "===!=!===!===":
                return 'y';
            case "===!===!=!=":
                return 'z';
            default:
                return ' ';
        }
    }
}