import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 5x5: ");

        int maior = -1000;

        int posI = -1;
        int posJ = -1;

        int[][] matriz = new int[5][5];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++) {
                System.out.printf("Elemendo[%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();

                if(matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    posI = i;
                    posJ = j;
                }
            }   
        }
        
        System.out.println("Matriz digitada: ");

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.printf("Maior elemento: %d\n--Posição--\nLinha: %d\nColuna: %d\n", maior, posI + 1, posJ + 1);

        scanner.close();
    }
}