package Ex1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hashtable<Integer, String> alunos = new Hashtable<>();
        Hashtable<Integer, String> alunosPresentes = new Hashtable<>();
        alunos.put(101, "João Silva");
        alunos.put(102, "Maria Oliveira");
        alunos.put(103, "Pedro Santos");
        String escolha;
        for(Integer id: alunos.keySet()) {
            System.out.println("ID: " + id + ", Nome: " + alunos.get(id));
            System.out.println("Está presente?: (S/N)");
            escolha = scanner.nextLine();
            if(escolha.equals("S") || escolha.equals("s")) {
                alunosPresentes.put(id, escolha);
            }
        }

        System.out.println("Alunos presentes: ");
        for(Integer id: alunosPresentes.keySet()) {
            System.out.println("ID: " + id + ", Nome: " + alunos.get(id));
        }

        scanner.close();

    }
}
