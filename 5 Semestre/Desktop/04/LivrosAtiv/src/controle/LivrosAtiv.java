package controle;

import java.util.ArrayList;
import java.util.List;

class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
}


public class LivrosAtiv {
    private static List<Livro> livros = new ArrayList<>();
    
    public static void adicionarLivro(String titulo, String autor, int ano) {
        livros.add(new Livro(titulo, autor, ano));
    }

    public static void editarLivro(int index, String titulo, String autor, int ano) {
        if (index >= 0 && index < livros.size()) {
            livros.get(index).setTitulo(titulo);
            livros.get(index).setAutor(autor);
            livros.get(index).setAno(ano);
        }
    }

    public static void removerLivro(int index) {
        if (index >= 0 && index < livros.size()) {
            livros.remove(index);
        }
    }

    public static int qtdRegistro() {
        return livros.size();
    }

    public static String[] titulos() {
        return new String[]{"Título", "Autor", "Ano"};
    }

    public static Object[][] getDados() {
        Object[][] dados = new Object[livros.size()][3];
        for (int i = 0; i < livros.size(); i++) {
            dados[i][0] = livros.get(i).getTitulo();
            dados[i][1] = livros.get(i).getAutor();
            dados[i][2] = livros.get(i).getAno();
        }
        return dados;
    }
}
