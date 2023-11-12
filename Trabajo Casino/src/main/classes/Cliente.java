package main.classes;

import credits.Ficha;
import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Facu
 */
public class Cliente implements Serializable {
    
    private String nombre;
    private String apellido; 
    private String dni;
    private String saldo;
    private HashMap<Ficha, Integer> fichas;
    
    
    public Cliente(String Nombre, String Apellido, String Dni, String Saldo) {
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.dni = Dni;
        this.saldo = Saldo;
        fichas = new HashMap(); //Realizar cambios necesarios para trabajar con el hashmap 
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public Object [] toArray(){
        Object [] obj = new Object[4] ;
        
        obj[0] = this.nombre;
        obj[1] = this.apellido;
        obj[2] = this.dni;
        obj[3] = this.saldo;
        return obj;
    }
    
    public void agregarFicha(Ficha color, int cantidad) {
        Integer val = cantidad;
        if (fichas.containsKey(color)) {
            val += fichas.get(color);
        }
        fichas.put(color, val);
        actualizarBalance();
    }

    private void actualizarBalance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
