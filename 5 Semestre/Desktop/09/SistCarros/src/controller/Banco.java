
package controller;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import models.Carro;


public class Banco {
    static Connection con;
    
    public static void conectDB(){
        String url;
        String user;
        String password;
        
        try {
            url = "jdbc:postgresql://localhost:5432/gercarro"; // caminho do banco
            user = "postgres";
            password = "1234";
            con = DriverManager.getConnection(url, user, password);            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            con = null;
        }
    }
    
    public static void novo(Carro carro) throws Exception {
        conectDB();
        
        // Utilização de PreparedStatement para evitar SQL Injection
        PreparedStatement p = con.prepareStatement(
            "INSERT INTO carro(nome, marca, cor, km, valor) VALUES(?,?,?,?,?)"
        );

        // Possível erro opas: os índices do PreparedStatement começam em 1, não 0
        p.setString(1, carro.nome);
        p.setString(2, carro.marca);
        p.setString(3, carro.cor);
        p.setInt(4, carro.km);
        p.setDouble(5, carro.valor);
        
        p.executeUpdate();
        
        con.close();
    }
    
    
    public static List<Carro> getCarros() {
        try {
            List<Carro> tmpCar = new LinkedList<>();

            conectDB();

            Statement ex = con.createStatement();        
            ResultSet r = ex.executeQuery("select id, nome, marca, cor, km, valor from carro order by id desc");

            con.close();       

            while (r.next()) {
                Integer id = r.getInt("id");
                String nome = r.getString("nome");
                String marca = r.getString("marca");
                String cor = r.getString("cor");
                Integer km = r.getInt("km");
                Double valor = r.getDouble("valor");
                tmpCar.add(new Carro(id, nome, marca, cor, km, valor));
            }

            return tmpCar;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        } 
        
    }
    
    

}
