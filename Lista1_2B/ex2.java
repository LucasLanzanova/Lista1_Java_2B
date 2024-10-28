package Lista1_2B;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class ex2 {
 
    public static void main(String[] args) {
        
                Scanner s = new Scanner(System.in);
        double[] notas = new double[10];
        double soma = 0, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = s.nextDouble();
            soma += notas[i];
            if (notas[i] > maior) maior = notas[i];
            if (notas[i] < menor) menor = notas[i];
        }

        double media = soma / 10;
        System.out.println("Média da sala: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        
    }
    
}
