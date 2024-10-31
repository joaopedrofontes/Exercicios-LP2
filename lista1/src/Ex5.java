
import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro valor: ");

        int n1 = scanner.nextInt();

        System.out.print("Segundo valor: ");

        int n2 = scanner.nextInt();

        System.out.println("Quociente: " + (n1 / n2) + "\nResto: " + (n1 % n2));

        scanner.close();
        
    } 
}
