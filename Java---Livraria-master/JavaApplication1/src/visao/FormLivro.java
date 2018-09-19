package visao;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import modeloConnection.ConexaoBD;
import modeloDao.DaoLivro;
import modeloBeans.BeansLivro;
import modeloBeans.ModeloTabela;

public class FormLivro extends javax.swing.JFrame {

    BeansLivro mod = new BeansLivro();
    DaoLivro control = new DaoLivro();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    
    /**
     * Creates new form FormLivro
     */
    public FormLivro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtFieldTitulo = new javax.swing.JTextField();
        jtxtFieldIsbn = new javax.swing.JTextField();
        jComboBoxEditora = new javax.swing.JComboBox();
        jtxtFieldPreco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtAutor = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSalvo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Livros");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 20, 180, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ISBN");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(290, 140, 75, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Título");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 70, 75, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Editora");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 140, 75, 30);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Preço");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(290, 210, 75, 30);

        jtxtFieldTitulo.setEnabled(false);
        jPanel1.add(jtxtFieldTitulo);
        jtxtFieldTitulo.setBounds(110, 70, 410, 30);

        jtxtFieldIsbn.setEnabled(false);
        jPanel1.add(jtxtFieldIsbn);
        jtxtFieldIsbn.setBounds(370, 140, 150, 30);

        jComboBoxEditora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "------------------------------", "Addison-Wesley", "John Wiley & Sons", "MIT Press", "O Reilly", "Oxford University Press", "Prentice Hall", "Random House", "Simon & Schuster", " " }));
        jComboBoxEditora.setEnabled(false);
        jPanel1.add(jComboBoxEditora);
        jComboBoxEditora.setBounds(110, 140, 160, 30);

        jtxtFieldPreco.setEnabled(false);
        jPanel1.add(jtxtFieldPreco);
        jtxtFieldPreco.setBounds(370, 210, 150, 30);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Autor");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 210, 75, 30);

        jtxtAutor.setEnabled(false);
        jPanel1.add(jtxtAutor);
        jtxtAutor.setBounds(110, 210, 160, 30);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNovo);
        jButtonNovo.setBounds(30, 260, 100, 32);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jPanel1.add(jButtonSalvar);
        jButtonSalvar.setBounds(30, 310, 100, 32);

        jButtonCancelar.setText("Cancelar");
        jPanel1.add(jButtonCancelar);
        jButtonCancelar.setBounds(30, 360, 100, 32);

        jTableSalvo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableSalvo);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(150, 260, 370, 180);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 560, 460);

        setSize(new java.awt.Dimension(616, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jtxtFieldTitulo.setEnabled(true);
        jtxtFieldIsbn.setEnabled(true);
        jtxtFieldPreco.setEnabled(true);
        jComboBoxEditora.setEnabled(true);
        jtxtAutor.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLivro().setVisible(true);
            }
        });
    }
    
    public void preencherTabela(String Sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Título", "ISBN", "Editora", "Autor"};
        conex.conexao();
        conex.executaSql(Sql);
        try {
            conex.rs.first();
            do {
                dados.add(new Object[]{conex.rs.getString("title"), conex.rs.getString("isbn"), conex.rs.getString("publisher_id"), conex.rs.getFloat("price")});
            } while (conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a tabela" + ex, "Erro", JOptionPane.ERROR);
        }
        
        //TABELA DE QUANDO CLICAR EM SALVAR
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableSalvo.setModel(modelo);
        jTableSalvo.getColumnModel().getColumn(0).setPreferredWidth(130);
        jTableSalvo.getColumnModel().getColumn(0).setResizable(false);
        jTableSalvo.getColumnModel().getColumn(1).setPreferredWidth(40);
        jTableSalvo.getColumnModel().getColumn(1).setResizable(false);
        jTableSalvo.getColumnModel().getColumn(2).setPreferredWidth(10);
        jTableSalvo.getColumnModel().getColumn(2).setResizable(false);
        jTableSalvo.getColumnModel().getColumn(3).setPreferredWidth(10);
        jTableSalvo.getColumnModel().getColumn(3).setResizable(false);
        jTableSalvo.getTableHeader().setReorderingAllowed(false);
        jTableSalvo.setAutoResizeMode(jTableSalvo.AUTO_RESIZE_ALL_COLUMNS);
        jTableSalvo.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxEditora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableSalvo;
    private javax.swing.JTextField jtxtAutor;
    private javax.swing.JTextField jtxtFieldIsbn;
    private javax.swing.JTextField jtxtFieldPreco;
    private javax.swing.JTextField jtxtFieldTitulo;
    // End of variables declaration//GEN-END:variables
}