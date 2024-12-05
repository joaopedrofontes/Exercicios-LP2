import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números inteiros separados por espaço:");
        String input = scanner.nextLine();

        ArrayList<Integer> list = new ArrayList<>();

        String[] numbers = input.trim().split("\\s+");

        for (String num : numbers) {
            list.add(Integer.parseInt(num));
        }

        Collections.sort(list);
        System.out.println("Lista ordenada: " + list);

        int encontrado = -1;
        while (encontrado == -1) {
            System.out.print("Digite o número a ser buscado: ");
            if (scanner.hasNextInt()) {
                int target = scanner.nextInt();
                encontrado = binarySearch(list, target);
                if (encontrado >= 0) {
                    System.out.println("posiçao: " + (encontrado + 1));
                } else {
                    System.out.println("Número não encontrado. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next();
            }
        }

        scanner.close();
    }

    public static int binarySearch(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == target) {
                return mid;
            }

            if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}