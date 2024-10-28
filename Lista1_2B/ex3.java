package Lista1_2B;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class ex3 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = s.nextLine();
        }

        System.out.println("Nomes informados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i]);
        }
        
    }
    
}
