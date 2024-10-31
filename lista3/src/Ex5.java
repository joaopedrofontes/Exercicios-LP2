
import java.util.Scanner;

public class Ex5 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas do triângulo: ");

        int n = scanner.nextInt();
        montaTrianguloPascal(n);
        scanner.close();
    }

    public static void montaTrianguloPascal(int n) {
        int[][] triangulo = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    triangulo[i][j] = 1;
                } else {

                    triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
                }
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}