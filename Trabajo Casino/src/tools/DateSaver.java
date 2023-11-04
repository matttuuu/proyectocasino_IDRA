package tools;
import java.sql.Connection;
import java.sql.*;
import java.text.DateFormat;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;



public class DateSaver {
    
   public void saveLastSession(){
       String query = "INSERT INTO last_login_info (fecha) VALUES (?);";
       Date fechaYHora = new Date();
       
       SimpleDateFormat customDateFormat = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy, 'a las' HH:mm");
       String formattedDate = customDateFormat.format(fechaYHora); //
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/casinodb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           PreparedStatement prep = con.prepareStatement(query);
           prep.setString(1, formattedDate);
           prep.executeUpdate();
          
            
           
           con.close();
           
       }
       catch (Exception e){
          // System.out.println("Hubo un error al insertar la ultima fecha :P");
          e.printStackTrace();
       }
       
   }
   
   public String getLastSession() {
       
       String query = "SELECT fecha FROM last_login_info order by id DESC LIMIT 1";
       String lastSavedDate  = "";
       
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/casinodb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
           
           PreparedStatement prep = con.prepareStatement(query);
           
          
          ResultSet rs = prep.executeQuery();
           if (rs.next()) {
               lastSavedDate = rs.getString("fecha");
           }
           
           con.close();
       }
       catch (Exception e) {
           
       }
       
       return lastSavedDate;
   }
    
    
    
}
