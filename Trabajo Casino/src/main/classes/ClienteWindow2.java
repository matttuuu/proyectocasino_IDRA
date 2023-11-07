package main.classes;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.List;

//Project custom packages
import tools.DateSaver;




public class ClienteWindow2 extends javax.swing.JFrame {

    private DefaultTableModel ModelAdd;
    private DefaultTableModel ModelShow;
    
    
    private String [] tableArray = {"Nombre","Apellido","DNI","Saldo"};
    
    private DateSaver fecha = new DateSaver();
    
    private DAOClientes daodb = new DAOClientes();

    
   
    
    /**
     * Creates new form ClienteWindow2
     */
    public ClienteWindow2() {
        initComponents();
        setSize(815,600);
        initTable();
        refreshTable();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombreTextField = new javax.swing.JTextField();
        apellidoTextField = new javax.swing.JTextField();
        dniTextField = new javax.swing.JTextField();
        saldoTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buttonAgregar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cleanFieldsButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clientes_jtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.setLayout(null);

        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });
        nombreTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(nombreTextField);
        nombreTextField.setBounds(270, 10, 339, 24);

        apellidoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTextFieldActionPerformed(evt);
            }
        });
        apellidoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(apellidoTextField);
        apellidoTextField.setBounds(270, 40, 339, 24);

        dniTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(dniTextField);
        dniTextField.setBounds(270, 70, 339, 24);

        saldoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoTextFieldActionPerformed(evt);
            }
        });
        saldoTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                saldoTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(saldoTextField);
        saldoTextField.setBounds(270, 100, 339, 24);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel1.setText("Saldo ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 100, 50, 16);

        buttonAgregar.setText("Agregar");
        buttonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAgregar);
        buttonAgregar.setBounds(70, 140, 200, 40);

        buttonEditar.setText("Editar");
        buttonEditar.setToolTipText("Haga doble click sobre una fila de la tabla para llenar los campos. \nActo seguido pulse este botón para modificar y guardar los cambios realizados");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEditar);
        buttonEditar.setBounds(630, 60, 80, 40);

        buttonEliminar.setText("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEliminar);
        buttonEliminar.setBounds(300, 140, 190, 40);

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel5.setText("Apellido");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 40, 88, 16);

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(190, 10, 88, 16);

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel7.setText("DNI");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(210, 70, 30, 16);

        cleanFieldsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/classes/cleanTextFieldIcon.png"))); // NOI18N
        cleanFieldsButton.setToolTipText("Limpiar Campos");
        cleanFieldsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanFieldsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cleanFieldsButton);
        cleanFieldsButton.setBounds(640, 20, 50, 23);

        jButton1.setText("refresh table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 30, 110, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 20, 760, 200);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla de clientes a agregar"));

        clientes_jtable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        clientes_jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Dni", "Saldo"
            }
        ));
        clientes_jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientes_jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientes_jtable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 240, 750, 266);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    //conexion y nombre de la db (temporalmente): jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=CONVERT_TO_NULL", "root","" / Casino_testdb
    
    private void saldoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoTextFieldActionPerformed

    private void buttonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarActionPerformed
        // TODO add your handling code here:
        String nom = this.nombreTextField.getText(); //Tomamos el texto que este en nuestros campos
        String ap = this.apellidoTextField.getText();
        String dni = this.dniTextField.getText();
        String saldo = this.saldoTextField.getText();
        
        //7-11-23
        //La funcionalidad de guardar deberia ser mas parecido a lo siguiente
        
       //Cuando se presiona el boton guardar, directamente se envia la informacion obtenida en los campos, hacia la db
       //Acto seguido, se refresca la db
        
        
        
        
        Cliente newClient = new Cliente(nom,ap,dni,saldo); //Creamos una nueva instancia de cliente
        
        this.daodb.Save(newClient);
        
        //ModelAdd.addRow(newClient.toArray()); //Usamos el metodo para agregar una fila del del tableModel
        
        this.nombreTextField.setText(""); //Limpiamos los campos cuando teminamos de guardar 
        this.apellidoTextField.setText("");
        this.dniTextField.setText("");
        this.saldoTextField.setText("");       
        
        this.refreshTable();
    }//GEN-LAST:event_buttonAgregarActionPerformed

    

    
    
    
    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void apellidoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_apellidoTextFieldActionPerformed

    private void nombreTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTextFieldKeyTyped
        
       int key = evt.getKeyChar();
        boolean upper = key >= 65 && key <= 90;
        boolean lower = key >= 97 && key <= 122;
        boolean space = key == 32; 
        
        if (!(upper || lower || space)){
            evt.consume();
        } 
    }//GEN-LAST:event_nombreTextFieldKeyTyped

    private void apellidoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoTextFieldKeyTyped
        // TODO add your handling code here:
           int key = evt.getKeyChar();
        boolean upper = key >= 65 && key <= 90;
        boolean lower = key >= 97 && key <= 122;
        boolean space = key == 32; 
        
        if (!(upper || lower || space)) {
            evt.consume();
        }
    }//GEN-LAST:event_apellidoTextFieldKeyTyped

    private void dniTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniTextFieldKeyTyped
        // TODO add your handling code here:
        //Solo permitimos numeros 
        int key = evt.getKeyChar();
        boolean numbers = key >= 48 && key <58;
        
        if (!numbers) { //Es importante el condicional !, para que evalue: "Si no es un numero, no dejo que sea escrito (evt.consume)"
            evt.consume();
        }
    }//GEN-LAST:event_dniTextFieldKeyTyped

    private void saldoTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saldoTextFieldKeyTyped
       int key = evt.getKeyChar();
        boolean numbers = key >= 48 && key <58;
        
        if (!numbers) { //Es importante el condicional !, para que evalue: "Si no es un numero, no dejo que sea escrito (evt.consume)"
            evt.consume();
        }
    }//GEN-LAST:event_saldoTextFieldKeyTyped

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
     
        /*
        if (this.clientes_jtable.getSelectedRowCount() != 1){
           return;
       }
       
       int fila = this.clientes_jtable.getSelectedRow();
       this.ModelAdd.removeRow(fila);
        */
       int fila = this.clientes_jtable.getSelectedRow();
       
        
      
    }//GEN-LAST:event_buttonEliminarActionPerformed

    
    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        if (this.clientes_jtable.getSelectedRowCount() != 1)  {
            return;
        }
        
        String nom = this.nombreTextField.getText(); 
        String ap = this.apellidoTextField.getText();
        String dni = this.dniTextField.getText();
        String saldo = this.saldoTextField.getText();
        int fila = clientes_jtable.getSelectedRow();
        
        Cliente c = new Cliente(nom,ap,dni,saldo);
         
        ModelAdd.setValueAt(c.getNombre(),fila,0);
        ModelAdd.setValueAt(c.getApellido(), fila, 1);
        ModelAdd.setValueAt(c.getDni(), fila, 2);
        ModelAdd.setValueAt(c.getSaldo(), fila, 3);
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void clientes_jtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientes_jtableMouseClicked
        if (evt.getClickCount() == 2) {
            int fila = this.clientes_jtable.getSelectedRow();
            
            String nombre = (String) ModelAdd.getValueAt(fila, 0);
            String apellido = (String) ModelAdd.getValueAt(fila, 1);
            String dni = (String) ModelAdd.getValueAt(fila, 2);
            String saldo = (String) ModelAdd.getValueAt(fila, 3);
            
            this.nombreTextField.setText(nombre);
            this.apellidoTextField.setText(apellido);
            this.dniTextField.setText(dni);
            this.saldoTextField.setText(saldo);
        }
        
    }//GEN-LAST:event_clientes_jtableMouseClicked

    private void cleanFieldsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanFieldsButtonActionPerformed
       this.nombreTextField.setText("");
       this.apellidoTextField.setText("");
       this.dniTextField.setText("");
       this.saldoTextField.setText("");
    }//GEN-LAST:event_cleanFieldsButtonActionPerformed

   
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.refreshTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(ClienteWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteWindow2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteWindow2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoTextField;
    private javax.swing.JButton buttonAgregar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton cleanFieldsButton;
    private javax.swing.JTable clientes_jtable;
    private javax.swing.JTextField dniTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField saldoTextField;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
       ModelAdd = new DefaultTableModel(this.tableArray,0){
           @Override
           public boolean isCellEditable(int row, int column){
               return false;
           }
       };
       clientes_jtable.setModel(ModelAdd);
       
       
      
    }

    private void refreshTable() { //
       this.clearTable();
       
                
        List<String[]> clientes = daodb.listarTodo();
        for(String[] data: clientes ){
             this.ModelAdd.addRow(data);
             
             
            //this.ModelAdd.addRow ( { data.getNombre(), data.getApellido(), data.getSaldo(), data.getJugadas().count() } );
             
        }
        //this.clearTable();
       
        
        /*
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/casinodb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            Statement st = con.createStatement();
            
            String query = "select * from customers";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                String name = rs.getString("firstName");
                String lastname = rs.getString("lastName");
                String idDni = String.valueOf(rs.getString("dni"));
                String balance = String.valueOf(rs.getString("balance"));
                
                String data[] = {name,lastname,idDni,balance};
                this.ModelAdd.addRow(data);
                
                
            }
            //Importante: cerrar con con.close();
            con.close();
       }
       catch(Exception e) {
           System.out.println(e.getMessage());
       } 
        */
    }
    
    private void clearTable() {
        this.ModelAdd.setRowCount(0);
    }
    
    
        
        
        
    
    
}

