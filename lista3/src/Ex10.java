
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a linha em que a torre se encontra: ");
        int linha = scanner.nextInt();
        System.out.print("Digite a coluna em que a torre se encontra: ");
        int coluna = scanner.nextInt();

        mostrarMovimentosPossiveis(linha, coluna);
        
        scanner.close();
    }

    public static void mostrarMovimentosPossiveis(int linha, int coluna) {
        char[][] matriz = new char[10][10];
    
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 && j == 0) {
                    matriz[i][j] = ' ';
                } else if (i == 0 && j != 0) {
                    matriz[i][j] = (char) ('0' + j - 1);
                } else if (i != 0 && j == 0) {
                    matriz[i][j] = (char) ('0' + i - 1);
                } else if (i == 1) {
                    matriz[i][j] = '-';
                } else if (j == 1) {
                    matriz[i][j] = '|';
                } else {
                    matriz[i][j] = '*';
                }
            }
        }
    
        for (int i = 2; i < 10; i++) {
            matriz[linha + 1][i] = 'x';
            matriz[i][coluna + 1] = 'x';
        }
    
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}