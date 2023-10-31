package tools;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateSelector {
    
   
    public String GetTodaysDate(){
        DateFormat dateformat = new SimpleDateFormat("EEE, MMM d, yyyy '@' HH:mm:ss");
        String date = dateformat.format(Calendar.getInstance().getTime());
        
        return date;
    }
    
}
