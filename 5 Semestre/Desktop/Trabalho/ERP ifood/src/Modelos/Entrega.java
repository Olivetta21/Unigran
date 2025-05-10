package Modelos;

import Modelos.cliente.Cliente;
import Modelos.delivery.Delivery;

public class Entrega {
    private Integer id;
    
    private Cliente cliente;
    private boolean isDelivery;
    
    private Delivery delivery;
    private Pedido pedido;    
    private StatusPedido status;
}
