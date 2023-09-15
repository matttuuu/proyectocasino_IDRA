package casinomain;


public class MainMenuWindow extends javax.swing.JFrame {


    public MainMenuWindow() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        btn_transaction = new javax.swing.JButton();
        btn_clients = new javax.swing.JButton();
        lastModifiedLabel = new javax.swing.JLabel();
        modifiedMagic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestor-Menu Principal");
        setBackground(new java.awt.Color(255, 51, 51));
        setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(null);

        welcomeLabel.setBackground(new java.awt.Color(255, 51, 51));
        welcomeLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setText("Bienvenido");
        welcomeLabel.setToolTipText("");
        getContentPane().add(welcomeLabel);
        welcomeLabel.setBounds(50, 30, 260, 52);

        btn_transaction.setText("Realizar transacción");
        btn_transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transactionActionPerformed(evt);
            }
        });
        getContentPane().add(btn_transaction);
        btn_transaction.setBounds(670, 430, 390, 74);

        btn_clients.setBackground(new java.awt.Color(51, 0, 0));
        btn_clients.setForeground(new java.awt.Color(153, 153, 0));
        btn_clients.setText("Gestionar clientes");
        btn_clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clients);
        btn_clients.setBounds(240, 430, 390, 74);

        lastModifiedLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lastModifiedLabel.setForeground(new java.awt.Color(51, 51, 51));
        lastModifiedLabel.setText("Ultimo registro / modificación:");
        getContentPane().add(lastModifiedLabel);
        lastModifiedLabel.setBounds(50, 80, 270, 70);

        modifiedMagic.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        getContentPane().add(modifiedMagic);
        modifiedMagic.setBounds(239, 77, 141, 43);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casinomain/casinomainbg3.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-390, -140, 2200, 1413);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transactionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_transactionActionPerformed

    private void btn_clientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientsActionPerformed
        // TODO add your handling code here:
        ClientsWindow window_client = new ClientsWindow();
        window_client.setVisible(true);
    }//GEN-LAST:event_btn_clientsActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clients;
    private javax.swing.JButton btn_transaction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastModifiedLabel;
    private javax.swing.JLabel modifiedMagic;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
