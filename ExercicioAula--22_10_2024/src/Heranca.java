



abstract class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void exibirInformacoes();
}

class Carro extends Veiculo {
    private int velocidade;

    public Carro(String marca, String modelo) {
        super(marca, modelo);
        this.velocidade = 0;
    }

    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Carro:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade);
    }
}

class Moto extends Veiculo {
    private int velocidade;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
        this.velocidade = velocidade;
    }

    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
    }
    @Override
    public void exibirInformacoes() {
        System.out.println("Moto:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade);
    }
}

public class Heranca {
    public static void main(String[] args) {
        Carro carro = new Carro("McLaren", "Senna");
        Moto moto = new Moto("Honda", "Pop 100");

        carro.exibirInformacoes();
        moto.exibirInformacoes();

        carro.acelerar(10);
        moto.acelerar(10);

        carro.exibirInformacoes();
        moto.exibirInformacoes();
    }
}
