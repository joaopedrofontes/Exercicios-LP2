
import java.util.Scanner;
import java.util.ArrayList;

public class Ex9 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor 32: ");

        int num = scanner.nextInt();

        int auxNum = num;

        ArrayList<Integer> lista = new ArrayList<>();

        while (num > 0) {
            lista.add(num % 2);
            num = num / 2;
        }

        System.out.print(auxNum + " Em binário é ");

        for(int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.get(i));
        }

        System.out.println();

        scanner.close();
    }
}
