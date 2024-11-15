package Ex4;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<PessoaIMC> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(new PessoaIMC(1.80, 80, new Homem("João")));
        listaDePessoas.add(new PessoaIMC(1.60, 55, new Mulher("Maria")));

        for(int i = 0; i < listaDePessoas.size(); i++){
            System.out.println("Nome" + listaDePessoas.get(i).getNome());
            System.out.println("IMC: " + listaDePessoas.get(i).getIMC());
        }
    }
}