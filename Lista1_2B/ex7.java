package Lista1_2B;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author lucas
 */
public class ex7 {
    
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int[] numeros = new int[50];

        for (int i = 0; i < 50; i++) {
            numeros[i] = rand.nextInt(100) + 1; // Preenche o vetor com números entre 1 e 100
        }

        System.out.print("Digite um número entre 1 e 100 para verificar: ");
        int numeroUsuario = s.nextInt();
        boolean encontrado = false;

        for (int num : numeros) {
            if (num == numeroUsuario) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Está presente");
        } else {
            System.out.println("Não está presente");
        }
    }
    
}
