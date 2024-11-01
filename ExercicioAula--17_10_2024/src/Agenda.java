import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


class Tarefa {
    String descricao;
    int prazo;
    int id;

    public Tarefa(String descricao, int prazo, int id) {
        this.descricao = descricao;
        this.prazo = prazo;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrazo() {
        return prazo;
    }
}

public class Agenda {
    private static List<Tarefa> listaDeTarefas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("===== AGENDA =====");
        while (true) {
            System.out.println("Escolha uma das seguintes opções: ");
            System.out.println("1 - Adicionar uma tarefa");
            System.out.println("2 - Remover uma tarefa");
            System.out.println("3 - Listar tarefas");
            System.out.println("4 - Sair");
            int escolha = scanner.nextInt();

            if(escolha == 4) {
                System.out.println("===== FIM =====");
                scanner.close();
                break;
            }
            switch (escolha) {
                case 1:
                    adicionarTarefa(listaDeTarefas);
                    break;
                case 2:
                    removerTarefa(listaDeTarefas);
                    break;
                case 3:
                    listarTarefas();
                    break;
            }
            mostrarMemoriaUsada();
        }
    }

    public static void adicionarTarefa(List<Tarefa> listaDeTarefas) {
        int id;
        String descricao;
        int prazo;

        System.out.print("Digite o id dessa tarefa: ");
        id = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < listaDeTarefas.size(); i++) {
            if(listaDeTarefas.get(i).id == id) {
                System.out.println("Já existe uma tarefa com esse id.");
                return;
            }
        }

        System.out.println("Digite a descrição dessa tarefa: ");
        descricao = scanner.nextLine();

        System.out.print("Digite quantos dias restantes você tem para realizar essa tarefa: ");
        prazo = scanner.nextInt();
        scanner.nextLine();

        listaDeTarefas.add(new Tarefa(descricao, prazo, id));
        System.out.println("Tarefa adicionada.");
    }

    public static void removerTarefa(List<Tarefa> listaDeTarefas) {
        int id;
        System.out.print("Digite o id da tarefa a ser removida: ");
        id = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < listaDeTarefas.size(); i++) {
            if(listaDeTarefas.get(i).getId() == id) {
                listaDeTarefas.remove(i);
                System.out.println("Tarefa removida.");
                return;
            }
        }
        System.out.println("Não existe uma tarefa com esse id.");
    }

    public static void listarTarefas() {
        for(int i = 0; i < listaDeTarefas.size(); i++) {
            System.out.println("Tarefa " + listaDeTarefas.get(i).getId() + ":");
            System.out.println(listaDeTarefas.get(i).getDescricao());
            System.out.println("Prazo: " + listaDeTarefas.get(i).getPrazo());
        }
    }

    public static void mostrarMemoriaUsada() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada em bytes: " + (runtime.totalMemory() - runtime.freeMemory()));
        System.out.println("Memoria usada em MB: " + ((runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024));
    }
}