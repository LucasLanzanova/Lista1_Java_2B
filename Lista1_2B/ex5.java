package Lista1_2B;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class ex5 {
    
      public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Quantas frutas você deseja informar? ");
        int quantidade = s.nextInt();
        s.nextLine();  // Consumir o newline após o número

        String[] frutas = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome da fruta " + (i + 1) + ": ");
            frutas[i] = s.nextLine();
        }

        System.out.println("\nFrutas informadas e quantidade de letras:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(frutas[i] + " - " + frutas[i].length() + " letras");
        }
    }
}






