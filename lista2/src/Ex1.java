
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as três notas do aluno: ");

        float p1 = scanner.nextFloat();

        float p2 = scanner.nextFloat();

        float p3 = scanner.nextFloat();

        float total = p1 + p2 + p3;

        if(total >= 21f) {
            System.out.println("O aluno está aprovado");
            scanner.close();
            return;
        }
        if(total >= 18f && p1 >= 3f && p2 >= 3f && p3 >= 3f) {
            System.out.println("O aluno está aprovado");
            scanner.close();
            return;
        }
        if(total < 8f) {
            System.out.println("O aluno está reprovado");
            scanner.close();
            return;
        }

        System.out.println("O aluno deverá realizar a reposição");

        scanner.close();
    }
}