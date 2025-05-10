package sistcarros;

import Telas.GerCarros;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SistCarros {

    public static void main(String[] args) throws Exception {
        JFrame princ = new GerCarros();
        princ.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        princ.setLocationRelativeTo(null);
        princ.setVisible(true);
    }
    
}
