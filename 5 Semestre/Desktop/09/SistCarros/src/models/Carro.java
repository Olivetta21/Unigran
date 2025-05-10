
package models;


public class Carro {
    public String nome, marca, cor;
    public Integer id, km;
    public Double valor;
    
    public Carro (Integer id, String nome, String marca, String cor, Integer km, Double valor) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.km = km;
        this.valor = valor;
    }
    
    
    public Carro (String nome, String marca, String cor, Integer km, Double valor) {
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.km = km;
        this.valor = valor;
    }
    
}