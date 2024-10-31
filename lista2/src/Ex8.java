
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número para ser calculado seus divisores: ");

        int n = scanner.nextInt();

        int i = 1;

        while(i < n) {
            if(n % i == 0){
                System.out.printf("%d é divisor de %d\n", i, n);
            }
            i++;
        }

        scanner.close();
    }
}