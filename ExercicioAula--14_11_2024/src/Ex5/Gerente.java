package Ex5;

public class Gerente extends Pessoa{
    private String area;
    private double salario;

    public Gerente(String nome, Data dataDeNascimento, String area, double salario) {
        super(nome, dataDeNascimento);
        this.area = area;
        this.salario = salario;
    }

    @Override
    public void mostrarDados() {
        System.out.println("Gerente: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getDataDeNascimento());
        System.out.println("Area: " + area);
        System.out.println("Imposto: " + calculaImposto());
    }

    public double calculaImposto() {
        return this.salario * 0.05;
    }

}