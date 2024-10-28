package Lista1_2B;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class ex1 {
    
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        double notas[] = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = s.nextDouble();
            soma += notas[i];
        }

        double media = soma / 4;
        System.out.println("A média das notas é: " + media);
        
    }
    
}
