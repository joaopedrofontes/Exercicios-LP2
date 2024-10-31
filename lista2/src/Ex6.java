
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os n primeiros elementos: ");

        int n = scanner.nextInt();

        float euler = 1;

        for(int i = 1; i <= n; i++) {
            euler += 1f / calculaFactorial(i);
        }

        System.out.println("aproximação: " + euler);

        scanner.close();

    }

    public static int calculaFactorial(int n) {
        int fatorial = 1;
        for(int i = n; i >= 1; i--) {
            fatorial *= i;
        }

        return fatorial;
    }
}