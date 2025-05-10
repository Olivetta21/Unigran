
package javaapplication3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TerceiraTela extends JFrame {
    JLabel jlNome;
    JLabel jlIdade;
    JLabel jlEndereco;
    JTextField jtNome;
    JTextField jtIdade;
    JTextArea jtEndereco;
    
    JScrollPane jsRolagem;
    
    JButton jbSalvar;
    JButton jbSair;
    
    public TerceiraTela() {
        iniciaComponente();
    }

    private void iniciaComponente() {
        jlNome = new JLabel("Seu Nome: ");
        jlIdade = new JLabel("Sua idade: ");
        jlEndereco = new JLabel("Sua Casa: ");
        jtNome = new JTextField();
        jtIdade = new JTextField();
        jtEndereco = new JTextArea();
        jsRolagem = new JScrollPane(jtEndereco);
        
        jbSalvar = new JButton("Save");
        jbSair = new JButton("Exit");
       
        
        
        posicionarComponentes();
        acoesComponentes();
        
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }   

    private void posicionarComponentes() {
        setLayout(null);
        jlIdade.setBounds(10, 10, 80, 30);
        jtIdade.setBounds(120, 10, 160, 30);
        
        jlNome.setBounds(10, 40, 80, 30);
        jtNome.setBounds(120, 40, 160, 30);
        
        jlEndereco.setBounds(10, 70, 80, 30);
        jsRolagem.setBounds(120, 70, 160, 160);
        
        jbSalvar.setBounds(120, 230, 80, 30);
        jbSair.setBounds(199, 230, 80, 30);
        
        add(jlIdade);
        add(jtIdade);
        add(jlNome);
        add(jtNome);
        add(jlEndereco);                
        add(jsRolagem);
        add(jbSalvar);
        add(jbSair);
    }
    
    
    public static void main(String[] args) {
        new TerceiraTela().setVisible(true);
    }

    private void acoesComponentes() {
        jbSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, jtIdade.getText());
            }
        });
        
        
        jbSair.addActionListener((e -> {
            dispose();
        }));
    }
}
