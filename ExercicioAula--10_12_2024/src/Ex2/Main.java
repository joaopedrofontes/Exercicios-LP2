package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
     // Lista {10, 15, 22, 37, 45, 56, 87, 92, 98, 99, 101, 110 }
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(15);
        nums.add(22);
        nums.add(37);
        nums.add(45);
        nums.add(56);
        nums.add(87);
        nums.add(92);
        nums.add(98);
        nums.add(99);
        nums.add(101);
        nums.add(110);

        List<Integer> odds = nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> evens = nums.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());

        System.out.println("Pares:" + odds);
        System.out.println("Ímpares:" + evens);
    }
}