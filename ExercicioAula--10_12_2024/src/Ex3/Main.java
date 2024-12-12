package Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String frase = "programacao em java";
        List<Character> chars = new ArrayList<>();
        for(char c : frase.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            if(chars.contains(c)) {
                continue;
            }
            chars.add(c);
        }
        List<Character> chars2 = chars.stream().sorted().collect(Collectors.toList());

        System.out.println(chars2);
    }
}