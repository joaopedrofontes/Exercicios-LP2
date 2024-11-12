import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner;
    public static ArrayList<Course> courseList;
    public static ArrayList<User> userList;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        courseList = new ArrayList<>();
        userList = new ArrayList<>();
        int option;

        while (true) {
            listOptions();
            option = scanner.nextInt();
            if (option == 0) {
                break;
            }
            switch (option) {
                case 1: addUser(); break;
                case 2: addCourse(); break;
                case 3: addUserToCourse(); break;
                case 4: addLessonToCourse(); break;
            }
        }

        System.out.println("Programa finalizado.");

        scanner.close();
    }

    public static void listOptions() {
        System.out.println("Escolha uma das opções: ");
        System.out.println("0 - Finalizar programa");
        System.out.println("1 - Adicionar um user novo");
        System.out.println("2 - Adicionar um curso novo");
        System.out.println("3 - Cadastrar um user em um curso");
        System.out.println("4 - Cadastrar uma aula em um curso");
    }

    public static void addUser() {
        System.out.println("Nome do usuario: ");
        String nome = scanner.next();
        System.out.println("Senha: ");
        String senha = scanner.next();

        userList.add(new User(nome, senha));
    }

    public static void addCourse() {
        System.out.println("Nome do curse: ");
        String nome = scanner.next();
        courseList.add(new Course(nome));
    }

    public static void addUserToCourse() {
        System.out.println("Nome do usuario: ");
        String nome = scanner.next();
        System.out.println("Nome do curso: ");
        String curso = scanner.next();
        for(int i = 0; i < userList.size(); i++) {
            if(userList.get(i).getUsername().equals(nome)) {
                for(int j = 0; j < courseList.size(); j++) {
                    if(courseList.get(j).getName().equals(curso)){
                        userList.get(i).subscribeIntoCourse(courseList.get(j));
                        break;
                    }
                }
            }
        }
    }

    public static void addLessonToCourse() {
        System.out.println("Nome da aula: ");
        String nome = scanner.next();
        System.out.println("Descrição da aula: ");
        String descricao = scanner.next();
        System.out.println("Nome do curso: ");
        String curso = scanner.next();
        for(int i = 0; i < courseList.size(); i++) {
            if(courseList.get(i).getName().equals(nome)) {
                courseList.get(i).addLesson(new Lesson(nome,descricao));
                break;
            }
        }
    }
}