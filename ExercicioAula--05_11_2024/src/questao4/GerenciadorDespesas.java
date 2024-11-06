package questao4;
import java.util.ArrayList;

public class GerenciadorDespesas {
    private ArrayList<despesaDia> listaDespesasDia;
    private ArrayList<despesaMes> listaDespesasMes;
    private String cpf;

    public GerenciadorDespesas(String cpf, ArrayList<despesaDia> listaDespesasDia, ArrayList<despesaMes> listaDespesasMes) {
        this.cpf = cpf;
        this.listaDespesasDia = listaDespesasDia;
        this.listaDespesasMes = listaDespesasMes;
    }

    public String getCpf() {
        return cpf;
    }

    public despesaMes getDespesaDia(int mes) {
        for(int i = 0; i < listaDespesasMes.size(); i++) {
            if(mes == listaDespesasMes.get(i).getMes()) {
                return listaDespesasMes.get(i);
            }
        }
        return null;
    }
}