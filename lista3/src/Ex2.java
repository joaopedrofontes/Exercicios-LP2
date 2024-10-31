
import java.util.Scanner;
import java.util.Arrays;

public class Ex2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 númeors: ");

        int[] vetor = new int[10];

        for(int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        Arrays.sort(vetor);

        for(int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");   
        }
        scanner.close();
    }
}