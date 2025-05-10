package Modelos.carrinho;

import Modelos.carrinho.ingrediente.IngredienteEscolha;
import Modelos.carrinho.produto.Produto;
import java.util.List;

public class Carrinho {
    private Integer id;
    private Produto produto;
    private Integer quantidade;
    private List<IngredienteEscolha> ingredienteEscolha;
}
