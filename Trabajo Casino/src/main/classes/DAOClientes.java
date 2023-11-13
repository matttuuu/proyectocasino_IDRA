package main.classes;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class DAOClientes { 
  
    public List <String[]> listarTodo()  {     
        
        List<String[]> salida = new ArrayList();
               
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/casinodb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            Statement st = con.createStatement();
            
            String query = "select * from customers";
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()){
                 String name = rs.getString("firstName");
                String lastname = rs.getString("lastName");
                String idDni = String.valueOf(rs.getString("dni"));
                String balance = String.valueOf(rs.getString("balance"));
                
                String data[] = {name,lastname,idDni,balance};
                salida.add(data);
                
            }
            
            con.close();       
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return salida;

    }
    
    
    
    public void Save(Cliente c) { 
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/casinodb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");          
             //query
                    String query = "insert into customers (firstName, lastName, dni, balance) "
                            + " values (?, ?, ? ,?);";
                    PreparedStatement prep = con.prepareStatement(query);
                 
                    prep.setString(1, c.getNombre());
                    prep.setString(2, c.getApellido());
                    prep.setString(3, c.getDni());
                    prep.setString(4, c.getSaldo());        
                    
                    prep.executeUpdate();             
        }
       
        catch(Exception e) { 
            e.printStackTrace();
            //message
        }
        
    }
    
    public void Delete(Cliente c) {        
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/casinodb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");   
             
            String query = "DELETE FROM customers WHERE (firstName, lastName, dni, balance) = (?,?,?,?);";
            
            PreparedStatement prep = con.prepareStatement(query);
            prep.setString(1,c.getNombre() ); //Podria ser que funcione con setString, podria ser que no :P
            prep.setString(2,c.getApellido() );
            prep.setString(3,c.getDni());
            prep.setString(4, c.getSaldo());
            
            prep.execute();
            
            JOptionPane.showMessageDialog(null, "Se borro el registro exitosamente");
            con.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ocurrio un error, no se han borrado campos");
        }
    }
    
    
    
    
}
