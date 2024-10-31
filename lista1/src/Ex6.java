
import java.util.Scanner;

public class Ex6 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade em dias: ");

        int diasTotais = scanner.nextInt();

        int anos = diasTotais / 365;

        int meses = (diasTotais % 365) / 30;

        int dias = (diasTotais % 365) % 30;

        System.out.println("Anos: " + anos);
        System.out.println("Meses: " + meses);
        System.out.println("Dias: " + dias);

        scanner.close();

    }
}
