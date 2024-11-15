package Ex5;

public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
       if(isValid(dia, mes)) {
           this.dia = dia;
           this.mes = mes;
           this.ano = ano;
       }
       else {
           this.dia = -1;
           this.mes = -1;
           this.ano = -1;
       }
    }

    private boolean isValid(int _dia, int _mes) {
        if(_dia < 0 || _dia > 31 || _mes < 0 || _mes > 12) {
            return  false;
        }
        return true;
    }

    public String getDataDeNascimento() {
        return (dia + "/" + mes + "/" + ano);
    }
}