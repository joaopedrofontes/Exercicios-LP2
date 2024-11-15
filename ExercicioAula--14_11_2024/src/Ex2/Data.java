package Ex2;

public class Data {
    private int dia, mes, ano;
    public Data(int dia, int mes, int ano) {
        if(dia < 0 || dia > 31 || mes < 0 || mes > 12){
            throw new IllegalArgumentException("Data invalida");
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }


    public static void main(String[] args) {
        Data data = new Data(8, 6, 2005);
        System.out.println("Dia: " + data.getDia());
        System.out.println("mês: " + data.getMes());
        System.out.println("Ano: " + data.getAno());

    }
}