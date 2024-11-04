
abstract class Forma {
    private int tipo;
    public Forma(int tipo) {
        this.tipo = tipo;
    }
    public abstract void calculaArea();
}

class Retangulo extends Forma {
    private int altura;
    private int largura;
    public Retangulo(int altura, int largura) {
        super(1);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public void calculaArea() {
        System.out.println("Área total: " + (altura * largura));
    }
}

class Circulo extends Forma {
    private double raio;
    public Circulo(int raio) {
        super(2);
        this.raio = raio;
    }
    public void calculaArea() {
        System.out.println("Área total: " + (3.14 * raio * raio));
    }
}

public class ClasseAbstrata {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10, 20);
        Circulo circulo = new Circulo(10);
        retangulo.calculaArea();
        circulo.calculaArea();
    }
}