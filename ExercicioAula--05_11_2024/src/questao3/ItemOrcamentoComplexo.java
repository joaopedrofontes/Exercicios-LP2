package questao3;
import java.util.ArrayList;

public class ItemOrcamentoComplexo extends ItemOrcamento {
    private ArrayList<ItemOrcamento> subitens;
    public ItemOrcamentoComplexo(String historico, float valor, ArrayList<ItemOrcamento> subitens) {
        super(historico, valor);
        this.subitens = subitens;
    }

    @Override
    public float getValor() {
        float sum = 0;
        for(int i = 0; i < this.subitens.size(); i++) {
            sum += this.subitens.get(i).getValor();
        }
        return sum;
    }

    public ItemOrcamento econtraItem(String historico) {
        for (int i = 0; i < this.subitens.size(); i++) {
            if(this.subitens.get(i).getHistorico().equals(historico)) {
                return this.subitens.get(i);
            }
        }
        return null;
    }
}