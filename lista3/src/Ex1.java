
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do vetor: ");

        int n = scanner.nextInt();

        int vertor[] = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.printf("Digite o %do elemento: ", i + 1);
            vertor[i] = scanner.nextInt();
        }
        System.out.print("vetor invertido: ");

        for(int i = n - 1; i >= 0; i--) {
            System.out.print(vertor[i] + " ");
        }
        scanner.close();
    }
    
}