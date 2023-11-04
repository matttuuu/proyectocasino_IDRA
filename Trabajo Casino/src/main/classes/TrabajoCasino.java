package main.classes;
import java.awt.event.*;

import tools.DateSaver;

public class TrabajoCasino {
    
    public static DateSaver fecha = new DateSaver();

    public static void main(String[] args) {
        Menu newmenu = new Menu();
        newmenu.setVisible(true);
        newmenu.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing (WindowEvent e){
                fecha.saveLastSession();
            }
        });
       
    }
    
}
