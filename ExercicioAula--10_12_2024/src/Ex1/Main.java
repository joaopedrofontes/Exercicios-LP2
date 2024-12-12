package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Chagas");
        nomes.add("Eduardo");
        nomes.add("Fávio");
        nomes.add("Baltazar");
        nomes.add("Gaspar");
        nomes.add("Fred");
        nomes.add("Bela");

        List<String> result = nomes.stream().filter(nome -> nome.length() > 5).sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());

        System.out.println(result);
    }
}