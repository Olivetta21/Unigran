
package livrosativ;

import controle.LivrosAtiv;
import javax.swing.*;
import java.awt.*;

public class Cadastro extends JDialog {
    private JTextField jtTitulo, jtAutor, jtAno;
    private JButton jbSalvar, jbCancelar;
    private int livroIndex;

    public Cadastro(Frame owner, int livroIndex) {
        super(owner, "Gerenciar Livro", true);
        this.livroIndex = livroIndex;
        init();
        preencheCampos();
        acoes();
    }

    private void init() {
        setLayout(null);

        JLabel jlTitulo = new JLabel("Título:");
        jlTitulo.setBounds(10, 10, 80, 30);
        add(jlTitulo);

        jtTitulo = new JTextField();
        jtTitulo.setBounds(100, 10, 200, 30);
        add(jtTitulo);

        JLabel jlAutor = new JLabel("Autor:");
        jlAutor.setBounds(10, 50, 80, 30);
        add(jlAutor);

        jtAutor = new JTextField();
        jtAutor.setBounds(100, 50, 200, 30);
        add(jtAutor);

        JLabel jlAno = new JLabel("Ano:");
        jlAno.setBounds(10, 90, 80, 30);
        add(jlAno);

        jtAno = new JTextField();
        jtAno.setBounds(100, 90, 200, 30);
        add(jtAno);

        jbSalvar = new JButton("Salvar");
        jbSalvar.setBounds(50, 140, 100, 40);
        add(jbSalvar);

        jbCancelar = new JButton("Cancelar");
        jbCancelar.setBounds(160, 140, 100, 40);
        add(jbCancelar);

        setSize(350, 250);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void preencheCampos() {
        if (livroIndex >= 0) {
            Object[][] dados = LivrosAtiv.getDados();
            jtTitulo.setText(dados[livroIndex][0].toString());
            jtAutor.setText(dados[livroIndex][1].toString());
            jtAno.setText(dados[livroIndex][2].toString());
        }
    }

    private void acoes() {
        jbSalvar.addActionListener(e -> {
            String titulo = jtTitulo.getText();
            String autor = jtAutor.getText();
            int ano = Integer.parseInt(jtAno.getText());

            if (livroIndex >= 0) {
                LivrosAtiv.editarLivro(livroIndex, titulo, autor, ano);
            } else {
                LivrosAtiv.adicionarLivro(titulo, autor, ano);
            }

            dispose();
        });

        jbCancelar.addActionListener(e -> dispose());
    }
}
