//Primer ventana prototipo hecha para probar botones y JTable
package main.classes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Facu
 */
public class ClientesTableWindow extends javax.swing.JFrame {

    /**
     * Creates new form ClientesTableWindow
     */
    private ArrayList <Cliente> peopleList; //Ver si es necesario cambiar el modificador de acceso private a otro
    
    public ClientesTableWindow() {
        peopleList = new ArrayList<Cliente >();
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

        jPopupMenu2 = new javax.swing.JPopupMenu();
        txtApellido = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personas_table = new javax.swing.JTable();
        txtDni = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 140, 30));

        txtSaldo.setBackground(new java.awt.Color(255, 255, 255));
        txtSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoKeyTyped(evt);
            }
        });
        getContentPane().add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 140, 30));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 140, 30));

        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("CLIENTES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Saldo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 50, -1));

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 50, -1));

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("DNI:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 30, -1));

        personas_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Dni", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        personas_table.setColumnSelectionAllowed(true);
        personas_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(personas_table);
        personas_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 530, 460));

        txtDni.setBackground(new java.awt.Color(255, 255, 255));
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 140, 30));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 90, 50));

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 150, 40));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 150, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 320, 20));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 320, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   
    
    private void AgregarUsuario() 
    {
        //Para agregar un nuevo usuario, creamos dos matrices con los tipos de dato String, mas abajo.
        
        String Mat [] [] = new String [peopleList.size()] [4];
        Cliente aux;
        
        for (int i = 0; i <peopleList.size(); i++) {
            aux= peopleList.get(i);
            Mat [i] [0]= aux.getNombre();
            Mat [i] [1]= aux.getApellido();
            Mat [i] [3]= aux.getDni();
            Mat [i] [2]= aux.getSaldo();
               
        personas_table.setModel(new javax.swing.table.DefaultTableModel(
            Mat,
            
            new String [] {
                "Nombre", "Apellido", "Dni", "Saldo"
            }
                
          
        ));
            
            
        }
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String Nom,ape,saldo,dni;
        
        try {
            Nom = txtNombre.getText();
            ape = txtApellido.getText();
            saldo = txtSaldo.getText(); //PONEMOS EL SALDO COMO STRING NO LO PARSEAMOS (SE PUEDE PARSEAR) 
            dni = txtDni.getText(); //TAMBIEN EL DNI LO PONGO COMO STRING PARA Y NO COMO INT 
            
            if (this.txtNombre.getText().equals("") || this.txtApellido.getText().equals("")  || this.txtDni.getText().equals("") || this.txtSaldo.getText().equals("")) {
                throw new Exception("Datos necesarios"); //La excepcion no se muestra, pero hace que funcione la de abajo :P
                
                
            } //Crear metodo externo que me valide cada campo, si esta vacio (puede usar try/catch para lanzar excepciones)
            
            
            peopleList.add(new Cliente(Nom,ape,dni,saldo));
        }
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Por favor, ingrese todos los datos de la persona\n antes de agregar un nuevo usuario"); //Tira el error, pero este no es el mensaje que queremos mostrar :P
        }
        
          
         AgregarUsuario();
         
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int c;
        try {
            c = personas_table.getSelectedRow();
            peopleList.remove(c);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Porfavor seleccione la/s filas a eliminar");
        }
        
         
        AgregarUsuario();
       
    }//GEN-LAST:event_btnBorrarActionPerformed

    
    
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int key = evt.getKeyChar();
        boolean upper = key >= 65 && key <= 90;
        boolean lower = key >= 97 && key <= 122;
        boolean space = key == 32; 
        
        if (!(upper || lower || space)){
            evt.consume();
        }
        
        //Hacemos lo mismo que en el Método dniKeyTiped: 
        //Consumimos el cáracter que pretendemos tipear si este no es una letra minuscula o mayuscula
        
        
    }//GEN-LAST:event_txtNombreKeyTyped

    
    
    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        //Solo permitimos numeros 
        int key = evt.getKeyChar();
        boolean numbers = key >= 48 && key <57;
        
        if (!numbers) { //Es importante el condicional !, para que evalue: "Si no es un numero, no dejo que sea escrito (evt.consume)"
            evt.consume();
        }
        
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
       
            int key = evt.getKeyChar();
        boolean upper = key >= 65 && key <= 90;
        boolean lower = key >= 97 && key <= 122;
        boolean space = key == 32; 
        
        if (!(upper || lower || space)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtSaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();
        boolean numbers = key >= 48 && key <57;
        
        if (!numbers) { //Es importante el condicional !, para que evalue: "Si no es un numero, no dejo que sea escrito (evt.consume)"
            evt.consume();
        }
    }//GEN-LAST:event_txtSaldoKeyTyped

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
            java.util.logging.Logger.getLogger(ClientesTableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesTableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesTableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesTableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesTableWindow().setVisible(true);
            }
        });
    }
    
//    public void storeTableModel(DefaultTableModel model) { //Metodo para guardar la info en la ruta especificada mas abajo (?)
//        ObjectOutputStream oos = null;
//        try {
//            oos = new ObjectOutputStream(new FileOutputStream("c:\\test"));
//            oos.writeObject(model.getDataVector());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }  finally{
//            if(oos != null)
//                try {
//                    oos.close();
//                } catch (IOException e) {
//                }
//        }
//    }
    
    private void savePeopleData(){
        
    }
    
    private boolean FieldIsValid(){
        return false;
    } 
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable personas_table;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
