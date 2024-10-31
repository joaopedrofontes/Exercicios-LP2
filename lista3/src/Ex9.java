
import java.util.Scanner;

public class Ex9 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("Digite os elementos da matriz 3x3: ");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();
            }   
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int soma = calculaValoresNaDiagonal(matriz, 3);

        System.out.println("Soma dos elemenetos abaixo da diagonal principal: " + soma);


        scanner.close();
    }

    public static int calculaValoresNaDiagonal(int[][] matriz, int n) {
        int soma = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    soma += matriz[i][j];
                }
            }
        }

        return soma;
    }
}