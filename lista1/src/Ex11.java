
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em m/s: ");

        float v = scanner.nextFloat();

        System.out.println("Velocidade em km/h: " + (v * 3.6));
        
        scanner.close();
    }
}