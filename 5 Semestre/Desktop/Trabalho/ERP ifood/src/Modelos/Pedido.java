package Modelos;

import Modelos.carrinho.Carrinho;
import Modelos.cliente.Cliente;
import java.util.List;

public class Pedido {
    private Integer id;
    private Integer datatime_pedido;
    private Integer nPedido;
    
       
    private List<Carrinho> carrinho;
    private Cliente cliente;
    
    
    private String reembolso;
    private StatusPedido status;
}
