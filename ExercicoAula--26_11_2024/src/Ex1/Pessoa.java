package Ex1;

import java.util.ArrayList;
import java.util.Comparator;

public class Pessoa {
    private String nome;
    int idade;
    double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Pedro", 20, 3500.00));
        pessoas.add(new Pessoa("João", 25, 2000.00));
        pessoas.add(new Pessoa("Artur", 30, 3000.00));
        pessoas.add(new Pessoa("Maria", 22, 2800.00));
        //regra: se idade maior que 21, aplica 10%de desconto
        Desconto desconto = p -> p.idade > 21 ? p.salario * 0.9 : p.salario;

        pessoas.stream().filter(p -> p.idade >= 25).forEach(p -> System.out.println(p.nome));

        pessoas.sort(Comparator.comparing(p -> p.nome));

        pessoas.forEach(p -> System.out.println(p.nome));

        pessoas.forEach(p -> p.salario = desconto.executar(p));

        pessoas.forEach(p -> System.out.println(p.nome + " - " + p.salario));


    }
}