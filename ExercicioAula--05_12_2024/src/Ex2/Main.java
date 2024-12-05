package Ex2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Product> products = new HashMap<>();

        products.put(1, new Product("teclado", 80));
        products.put(2, new Product("mouse", 24));
        products.put(3, new Product("mesa", 17));
        products.put(4, new Product("fone", 50));
        products.put(5, new Product("mousepad", 10));

        for(Map.Entry<Integer, Product> entry : products.entrySet()) {
            if(entry.getValue().getQuantidade() < 30) {
                System.out.println(entry.getValue().getNome());
            }
        }
    }
}
