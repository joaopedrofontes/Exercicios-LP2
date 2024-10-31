
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a velocidade média e o tempo gasto na viagem: ");

        int v = scanner.nextInt();

        int t = scanner.nextInt();

        System.out.println("Combustível gasto: " + ((v * t) / 12f));

        scanner.close();
    }
}