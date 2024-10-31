import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = 2;
        int n = 3;

        int[][] m1 = new int[m][n];
        int[][] m2 = new int[n][m];

        System.out.println("Digite os elementos da primeira matriz: ");
        for(int i = 0; i < m; i ++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                m1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz: ");
        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < m; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                m2[i][j] = scanner.nextInt();
            }
        }
        
        //teste print
         
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }

        int[][] matrizResultante = multiplicarMatriz(m, n, m1, m2);

        System.out.println("matriz resultante: ");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++){
                System.out.print(matrizResultante[i][j] + " ");
            }
            System.out.println();
        }
        

        scanner.close();
    }

    public static int[][] multiplicarMatriz(int m, int n, int[][] m1, int[][] m2){ // m1[m][n] e m2[n][m]
        int[][] resultado = new int[m][m];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    resultado[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        return resultado;
    }
}  