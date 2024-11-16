package sistemaDeGestao;

public class FuncionarioAssalariado extends Funcionario implements Bonus{
    private double salario;

    public FuncionarioAssalariado(String nome) {
        super(nome);
    }
    @Override
    public void calculaSalario(double salarioPorHora) {
        this.salario += (salarioPorHora * 8 * 22);
    }

    public void calcularBonus(double bonus) {
        this.salario += bonus;
    }

}