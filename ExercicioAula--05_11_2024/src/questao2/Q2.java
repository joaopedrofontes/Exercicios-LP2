package questao2;

public class Q2 {
    public static void main(String[] args) {
        IngressoNormal normal = new IngressoNormal(80);
        CamaroteInf inf = new CamaroteInf(80, "Poltrona A2");
        CamaroteSup sup = new CamaroteSup(80, "Poltrona J8");

        System.out.println("preco do ingresso normal: " + normal.getPreco());
        System.out.println("preco do ingresso camarote inferior: " + inf.getPreco());
        System.out.println("Localizacao do ingresso camarote inferior: " + inf.getLocalizacao());
        System.out.println("preco do ingresso camarote superior: " + sup.getPrecoSup());
        System.out.println("Localizacao do ingresso camarote superior: " + sup.getLocalizacao());
    }
}