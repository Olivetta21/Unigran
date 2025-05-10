
package livrosativ;


import controle.LivrosAtiv;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Principal extends JFrame {
    private JTable tabela;
    private JScrollPane scroll;
    private JButton jbSair, jbAdicionar, jbEditar, jbRemover;
    private JPanel painel;

    public Principal() {
        init();
        acoes();
    }

    private void init() {
        painel = new JPanel(new FlowLayout());
        setLayout(new BorderLayout());

        tabela = new JTable();
        scroll = new JScrollPane(tabela);
        jbAdicionar = new JButton("Adicionar");
        jbEditar = new JButton("Editar");
        jbRemover = new JButton("Remover");
        jbSair = new JButton("Sair");

        add(scroll, BorderLayout.CENTER);
        add(painel, BorderLayout.PAGE_END);

        painel.add(jbAdicionar);
        painel.add(jbEditar);
        painel.add(jbRemover);
        painel.add(jbSair);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400);

        atualizaTabela();
    }

    private void atualizaTabela() {
        DefaultTableModel model = new DefaultTableModel(LivrosAtiv.getDados(), LivrosAtiv.titulos());
        tabela.setModel(model);
    }

    private void acoes() {
        jbAdicionar.addActionListener(e -> {
            new Cadastro(this, -1).setVisible(true);
            atualizaTabela();
        });

        jbEditar.addActionListener(e -> {
            int selectedRow = tabela.getSelectedRow();
            if (selectedRow >= 0) {
                new Cadastro(this, selectedRow).setVisible(true);
                atualizaTabela();
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um livro para editar.");
            }
        });

        jbRemover.addActionListener(e -> {
            int selectedRow = tabela.getSelectedRow();
            if (selectedRow >= 0) {
                LivrosAtiv.removerLivro(selectedRow);
                atualizaTabela();
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um livro para remover.");
            }
        });

        jbSair.addActionListener(e -> dispose());
    }

    public static void main(String[] args) {
        new Principal().setVisible(true);
    }
}
