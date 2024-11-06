package questao2;

public class IngressoNormal extends Ingresso{
    public IngressoNormal(float preco) {
        super(preco);
    }

    public void imprimirTipo() {
        System.out.println("Ingresso normal");
    }
}