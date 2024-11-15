package Ex5;

public class Funcionario extends Pessoa {
    private double salario;
    private Gerente gerente;

    public Funcionario(String nome, Data dataDeNascimento, double salario, Gerente gerente) {
        super(nome, dataDeNascimento);
        this.salario = salario;
        this.gerente = gerente;
    }

    public Funcionario(String nome, Data dataDeNascimento, double salario) {
        super(nome, dataDeNascimento);
        this.salario = salario;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Funcionário: ");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Data de nascimento: " + super.getDataDeNascimento());
        System.out.println("Imposto: " + calculaImposto());
    }

    public double calculaImposto() {
        return this.salario * 0.03;
    }
}