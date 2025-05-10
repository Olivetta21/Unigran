package app;

import controle.PrimeiraClasse;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class QuartaTela extends JFrame{

    private JTable tabela;
    private JScrollPane scroll;
    private JButton jbSair;
    private JButton jbCadastrar;
    private JPanel painel;
    
    public QuartaTela(){
        init();
        acoes();
    }

    private void init() {
        painel = new JPanel(new FlowLayout());
        setLayout(new BorderLayout());
        tabela = new JTable(10, 4);
        scroll = new JScrollPane();
        scroll.setViewportView(tabela);
        jbSair = new JButton("Sair");
        jbCadastrar = new JButton("Cadastrar");
        
        add(scroll,BorderLayout.CENTER);
        add(painel,BorderLayout.PAGE_END);
        painel.add(jbSair);
        painel.add(jbCadastrar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        
        atualizaTabela();
    }
    
    public void atualizaTabela(){
        int qtd = PrimeiraClasse.qtdRegistro();
        String[] vetorTitle = PrimeiraClasse.titulos();
        Object[][] matrizDados = new Object[qtd][vetorTitle.length];
        for(int i = 0; i < qtd; i++){
            matrizDados[i] = PrimeiraClasse.getDados(i);
        }
        DefaultTableModel dm = new DefaultTableModel(matrizDados,vetorTitle);
        tabela.setModel(dm);
    }
    
    public static void main(String[] args) {
        new QuartaTela().setVisible(true);
    }

    private void acoes() {
        jbCadastrar.addActionListener((e)->{
            new TerceiraTela().setVisible(true);
            atualizaTabela();
        });
        jbSair.addActionListener((e)->{
            dispose();
        });
    }
    
}
