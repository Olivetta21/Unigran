package Modelos.pagamento;

import Modelos.pagamento.cupom.Cupom;
import Modelos.pagamento.metodo.Metodo;

public class Pagamento {
    private Integer id;
    private Integer pedido_id;
    private Metodo metodo;
    private Cupom cupom;
}
