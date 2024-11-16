package sistemaDeGestao;

public class FuncionarioHorista extends Funcionario implements Bonus{
    private double salario;
    public FuncionarioHorista(String nome) {
        super(nome);
    }

    @Override
    public void calculaSalario(double salario) {
        this.salario += salario;
    }

    public void calcularBonus(double bonus) {
        this.salario += bonus;
    }
}