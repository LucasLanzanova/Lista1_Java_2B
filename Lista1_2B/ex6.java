package Lista1_2B;
import java.util.Scanner;/**
 *
 * @author lucas
 */
public class ex6 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Quantos pre�os voc� deseja informar? ");
        int quantidade = s.nextInt();
        double[] precos = new double[quantidade];
        double soma = 0, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o pre�o " + (i + 1) + ": ");
            precos[i] = s.nextDouble();
            soma += precos[i];
            if (precos[i] > maior) maior = precos[i];
            if (precos[i] < menor) menor = precos[i];
        }

        double media = soma / quantidade;
        System.out.println("\nMenor pre�o: " + menor);
        System.out.println("Maior pre�o: " + maior);
        System.out.println("M�dia dos pre�os: " + media);
    }
    
}
