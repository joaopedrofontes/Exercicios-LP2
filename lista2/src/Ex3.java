
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um ano: ");

        int ano = scanner.nextInt();

        checarBissexto(ano);

        scanner.close();
    }

    public static void checarBissexto(int ano) {

        if(ano % 100 == 0) {
            if(ano % 400 == 0) {
                System.out.println("É bissexto");
                return;
            }
            System.out.println("Não é bissexto");
            return;
        }

        if(ano % 4 == 0) {
            System.out.println("É bissexto");
            return;
        }

        System.out.println("Não é bissexto");
    }
}