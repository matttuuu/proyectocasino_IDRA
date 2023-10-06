/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.casino;

import java.io.Serializable;

/**
 *
 * @author Facu
 */
public class Cliente implements Serializable {
    
    private String nombre;
    private String apellido; 
    private String dni;
    private String saldo;
    
    
    public Cliente(String Nombre, String Apellido, String Dni, String Saldo) {
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.dni = Dni;
        this.saldo = Saldo;
        
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
    
    
}
