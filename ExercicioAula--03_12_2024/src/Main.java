
import java.util.*;

class StringAndPos {
    private String str;
    private int pos;
    public StringAndPos(String str, int pos) {
        this.str = str;
        this.pos = pos;
    }
    public String getStr() {
        return str;
    }
    public int getPos() {
        return pos;
    }

    public int getTam() {
        return this.str.length();
    }

}

public class Main {

    public static void main(String[]args) {
        List<String> strings = new ArrayList<>();
        List<StringAndPos> stringAndPosList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String entrada = "0";

        System.out.println("Digite strings: (digite '-1' para parar)");

        while(!entrada.equals("-1")){
            entrada = scanner.nextLine();
            strings.add(entrada);
        }

        strings.removeLast();

        for(int i = 0; i < strings.size(); i++){
            stringAndPosList.add(new StringAndPos(strings.get(i), i));
        }

        Collections.sort(stringAndPosList, Comparator.comparing(StringAndPos::getTam));

        for (StringAndPos stringAndPos : stringAndPosList) {
            System.out.println(stringAndPos.getStr());
        }

    }
}