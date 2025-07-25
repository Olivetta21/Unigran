package Telas;

import controller.CtrlCadastro;
import java.awt.Frame;
import javax.swing.JOptionPane;


public class Cadastro extends javax.swing.JDialog {

    public Cadastro(Frame owner) {
        super(owner, "Cadastrar Carro", true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jtf_Nome = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jtf_Marca = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jtf_Cor = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jtf_Km = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jtf_Valor = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jb_Voltar = new javax.swing.JButton();
        jb_Salvar = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(250, 215));
        setPreferredSize(new java.awt.Dimension(250, 215));
        setResizable(false);

        jPanel5.setLayout(new java.awt.GridLayout(5, 2, 0, 5));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Nome");
        jPanel5.add(jLabel21);

        jtf_Nome.setPreferredSize(new java.awt.Dimension(300, 22));
        jPanel5.add(jtf_Nome);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Marca");
        jPanel5.add(jLabel22);

        jtf_Marca.setPreferredSize(new java.awt.Dimension(300, 22));
        jPanel5.add(jtf_Marca);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Cor");
        jPanel5.add(jLabel23);

        jtf_Cor.setPreferredSize(new java.awt.Dimension(300, 22));
        jPanel5.add(jtf_Cor);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("KM");
        jPanel5.add(jLabel24);

        jtf_Km.setPreferredSize(new java.awt.Dimension(300, 22));
        jPanel5.add(jtf_Km);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Valor");
        jPanel5.add(jLabel25);

        jtf_Valor.setPreferredSize(new java.awt.Dimension(300, 22));
        jPanel5.add(jtf_Valor);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        jb_Voltar.setText("voltar");
        jb_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_VoltarActionPerformed(evt);
            }
        });
        jPanel8.add(jb_Voltar);

        jb_Salvar.setText("salvar");
        jb_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SalvarActionPerformed(evt);
            }
        });
        jPanel8.add(jb_Salvar);

        getContentPane().add(jPanel8, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SalvarActionPerformed
        String nome = jtf_Nome.getText();
        String marca = jtf_Marca.getText();
        String cor = jtf_Cor.getText();                
        String km = jtf_Km.getText();
        String valor = jtf_Valor.getText();
             
        
        if (CtrlCadastro.salvar(nome, marca, cor, km, valor)) {
            JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
            dispose();
        }
        else JOptionPane.showMessageDialog(null, "Erro ao adicionar");
    }//GEN-LAST:event_jb_SalvarActionPerformed

    private void jb_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jb_VoltarActionPerformed


  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton jb_Salvar;
    private javax.swing.JButton jb_Voltar;
    private javax.swing.JTextField jtf_Cor;
    private javax.swing.JTextField jtf_Km;
    private javax.swing.JTextField jtf_Marca;
    private javax.swing.JTextField jtf_Nome;
    private javax.swing.JTextField jtf_Valor;
    // End of variables declaration//GEN-END:variables
}
