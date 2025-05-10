
package controller;

import java.util.List;
import javax.swing.JOptionPane;
import models.Carro;

public class CtrlCadastro {
    
    
    public static String[] getTitulos() {
        return new String[]{"id", "Nome", "Marca", "Cor", "Km", "Valor"};
    }
    
    public static Object[][] getDados() {        
        List<Carro> carros = Banco.getCarros();
        
        if (carros == null) {
            JOptionPane.showMessageDialog(null, "Sem carros");
            return null;
        }
        
        Object[][] dados = new Object[carros.size()][6];
        for (int i = 0; i < carros.size(); i++) {
            dados[i][0] = carros.get(i).id;
            dados[i][1] = carros.get(i).nome;
            dados[i][2] = carros.get(i).marca;
            dados[i][3] = carros.get(i).cor;
            dados[i][4] = carros.get(i).km;
            dados[i][5] = carros.get(i).valor;
        }
        return dados;
    }
    
    public static boolean salvar(String nome, String marca, String cor, String km, String valor) {
                
        if (nome.isBlank() || marca.isBlank() || cor.isBlank() || km.isBlank()|| valor.isBlank()) {
            JOptionPane.showMessageDialog(null, "Valores incorretos");
            return false;
        }
        
        Integer i_km = null;
        Double i_valor = null;
        
        try {
            i_km = Integer.valueOf(km);
            i_valor = Double.valueOf(valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Numero inválido");
            return false;
        }   
        
        try {
            Banco.novo(new Carro(nome, marca, cor, i_km, i_valor));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
}
