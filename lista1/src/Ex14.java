

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os valores de A e B que serão trocados:\nA: ");

        int a = scanner.nextInt();

        System.out.print("B: ");

        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("Valores trocados:\nA: " + a + "\nB: " + b);

        scanner.close();
    }
}