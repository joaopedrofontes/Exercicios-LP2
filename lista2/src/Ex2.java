import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um caracter: ");

        char caracter = scanner.nextLine().toLowerCase().charAt(0);

        checarCaracter(caracter);

        scanner.close();

    }

    public static void checarCaracter(char input) {

        char vogais[] = {'a', 'e', 'i', 'o', 'u'};
        char consoantes[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        char numeros[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        if(verificarExistencia(vogais, input)) {
            System.out.println("É uma vogal");
            return;
        }

        if(verificarExistencia(consoantes, input)) {
            System.out.println("É uma consoante");
            return;
        }

        if(verificarExistencia(numeros, input)) {
            System.out.println("É um número");
            return;
        }

        System.out.println("É um símbolo");
    }

    public static boolean verificarExistencia(char lista[], char input) {

        for(int i = 0; i < lista.length; i++) {
            if(input == lista[i]) {
                return true;
            }
        }

        return false;
    }
}