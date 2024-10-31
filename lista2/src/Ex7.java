
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a ser calculado o fatorial: ");

        int n = scanner.nextInt();

        int fatorial = 1;
        for(int i = n; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println(fatorial);

        scanner.close();
    }
}