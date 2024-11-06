package questao1;

public class Q1 {
    public static void main(String[] args) {
        Novo novoImovel = new Novo("Natal", 100);
        Velho velhoImovel = new Velho("Caicó", 200);

        System.out.println("Locallização do imovel novo: " + novoImovel.getEndereco());
        System.out.println("Preço do imovel novo: " + novoImovel.getPreco());
        System.out.println("Preço reajustado: " + novoImovel.getPrecoNovo());
        System.out.println("Diferenca de preco: " + novoImovel.getDiferencaPreco());
        System.out.println();
        System.out.println("Localização do imovel velho: " + velhoImovel.getEndereco());
        System.out.println("Preco do imovel velho: " + velhoImovel.getPreco());
        System.out.println("Preco reajustado: " + velhoImovel.getPrecoNovo());
        System.out.println("Diferenca de preco: " + velhoImovel.getDiferencaPreco());
    }
}