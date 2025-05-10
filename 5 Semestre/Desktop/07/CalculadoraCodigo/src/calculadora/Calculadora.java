package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
    JPanel jP_tela = new JPanel();
    JTextField jTF_input = new JTextField();
    JPanel jP_botoes = new JPanel();
    
    public Calculadora() {
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        
        jP_tela.setLayout(new BorderLayout());
        jP_botoes.setLayout(new GridLayout(4, 4, 5, 5));
        
        String[] botoes = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            ".", "0", "=", "+"
        };        
        for (String b : botoes) jP_botoes.add(new JButton(b));
        
        jP_tela.add(jTF_input, BorderLayout.NORTH);
        jP_tela.add(jP_botoes, BorderLayout.CENTER);
        
        add(jP_tela);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Calculadora();
    }
}
