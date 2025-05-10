package app;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        
        tela.setLayout(new FlowLayout());
        tela.setSize(1920, 1080);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);
        
        JButton botao = new JButton("Clique Aqui!");
        tela.add(botao);
        
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //botao.setText("vc clicou");
                JOptionPane.showMessageDialog(tela, "Ola mundo");
            }
        });
    };

    }
    
