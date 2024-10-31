
import java.util.Scanner;
import java.util.ArrayList;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Float> lista = new ArrayList<>();
         
        System.out.print("Digite a primeira nota do primeiro bimestre: ");
        
        lista.add(scanner.nextFloat());

        System.out.print("Digite a segunda nota do primeiro bimestre: ");
        
        lista.add(scanner.nextFloat());
    
        System.out.print("Digite a primeira nota do segundo bimestre: ");
        
        lista.add(scanner.nextFloat());

        System.out.print("Digite a segunda nota do segundo bimestre: ");
        
        lista.add(scanner.nextFloat());

        float total = 0;

        for(int i = 0; i < lista.size(); i++) {
            total += lista.get(i);
        }

        System.out.println("A média desse aluno é: " + (total / 4));

        scanner.close();
    }
}
