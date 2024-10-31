
import java.util.Scanner;

public class Ex7 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor em Fahrenheit: ");

        float f = scanner.nextFloat();

        System.out.println("Valor em Celsius: " + 5 * (f - 32) / 9);

        scanner.close();
    }

}
