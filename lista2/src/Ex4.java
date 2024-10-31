import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Digite a senha: ");
            num = scanner.nextInt();
            if(num == 1234) {
                System.out.println("ACESSO PERMITIDO");
                break;
            }
            System.out.println("ACESSO NEGADO");
        } while(num != 1234);

        scanner.close();
    }
}