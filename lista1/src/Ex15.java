
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores de comprimento, largura e altura do retângulo: ");

        int c = scanner.nextInt();

        int l = scanner.nextInt();

        int h = scanner.nextInt();
        
        System.out.println("O volume é de " + (c * l * h));

        scanner.close();
    }
}