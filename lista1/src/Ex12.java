
import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("DIgite o valor da primeira resistência: ");

        float r1 = scanner.nextFloat();

        System.out.print("DIgite o valor da segunda resistência: ");

        float r2 = scanner.nextFloat();

        System.out.print("DIgite o valor da terceira resistência: ");

        float r3 = scanner.nextFloat();

        float rAux = (r1 * r2) / (r1 + r2);

        float rTotal = (rAux * r3) / (rAux + r3);

        System.out.println("Resistência total: " + rTotal);

        scanner.close();
    }
}