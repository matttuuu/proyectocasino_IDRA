package credits;



public abstract class Credito {
    
    protected String colorDenom; //Color-Denominacion de la ficha en cuestión
    protected double valor; //Valor de la ficha
    
    
    public Credito( String color, double val ) { //Constructor
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
    
    
    
}

