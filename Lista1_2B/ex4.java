package Lista1_2B;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class ex4 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] valor1 = new int[8];
        int[] valor2 = new int[8];
        int[] resultado = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o número " + (i + 1) + " para valor 1: ");
            valor1[i] = s.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o número " + (i + 1) + " para valor 2: ");
            valor2[i] = s.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            resultado[i] = valor1[i] * valor2[i];
        }

        System.out.println("Resultado da multiplicação:");
        for (int i = 0; i < 8; i++) {
            System.out.println("resultado[" + (i+1) + "]: " + resultado[i]);
        }
    }
}






