package Ex4;

public class PessoaIMC extends Pessoa{
    private double altura;
    private double peso;
    private Homem homem;
    private Mulher mulher;

    public PessoaIMC( double altura, double peso, Homem homem) {
        super(homem.getNome());
        this.altura = altura;
        this.peso = peso;
        this.homem = homem;
    }
    public PessoaIMC(double altura, double peso, Mulher mulher) {
        super(mulher.getNome());
        this.altura = altura;
        this.peso = peso;
        this.mulher = mulher;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }

    public double getIMC() {
        return peso / altura * altura;
    }

    public String getName() {
        return super.getNome();
    }

}