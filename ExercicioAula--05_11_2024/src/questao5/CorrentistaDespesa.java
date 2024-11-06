package questao5;
import java.util.ArrayList;

// classe exemplo (incompleta)
class Correntista {
    private float saldo;
    private float despesa;
    public float getSaldo() {
        return saldo;
    }
    public float getDespesa() {
        return despesa;
    }
}

//classe exemplo (incompleta)
public class CorrentistaDespesa {

    public ArrayList<Correntista> correntistasSaldoMaiorDespesa(ArrayList<Correntista> correntistas) {
        ArrayList<Correntista> listaAux = new ArrayList<Correntista>();
        for(int i = 0; i < correntistas.size(); i++) {
            if(correntistas.get(i).getSaldo() > correntistas.get(i).getDespesa()) {
                listaAux.add(correntistas.get(i));
            }
        }
        return listaAux;
    }
}