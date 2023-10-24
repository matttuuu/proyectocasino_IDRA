package credits;

import java.util.Objects;

public class Ficha {
    
    protected String colorDenom; //Color-Denominacion de la ficha en cuestión
    protected double valor; //Valor de la ficha
    
    
    public Ficha( String color, double val ) { //Constructor
        this.colorDenom = color;
        this.valor = val;
        
    }
    
    
    public String getColorDenomination(){
        return this.colorDenom;
    }
    
    public double getValor(){
        return this.valor;
    }

    //
    

    public void setValor(double valor) {
        this.valor = valor;
    }
    //

    @Override
    public String toString() {
        return "Credito{" + "colorDenom=" + colorDenom + ", valor=" + valor + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.colorDenom);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.valor) ^ (Double.doubleToLongBits(this.valor) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ficha other = (Ficha) obj;
        return true;
    }
    
    
    
}

