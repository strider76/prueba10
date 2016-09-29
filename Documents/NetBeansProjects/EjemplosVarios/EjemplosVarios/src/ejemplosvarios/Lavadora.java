/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosvarios;

/**
 *
 * @author strider
 */
public class Lavadora extends Electrodomestico{
    
    private final double CARGA_POR_DEFECTO=5.00;
    private double carga;
    
    public Lavadora(){
        
        super();
        this.carga=this.CARGA_POR_DEFECTO;
        
    }
    
    public Lavadora (double precio, double peso){
        
        super(precio,peso);
        super.precioBase+=this.precioFinal();
        this.carga=this.CARGA_POR_DEFECTO;
        
    }
    
    public Lavadora (double carga, double precio, double peso, char consumo, String color){
        
        super(precio,peso,consumo,color);
        this.carga=carga;
        
    }
    
    public double getCarga(){
        return this.carga;
    }
    
    public double precioFinal(){
        if (this.carga>=30)
            return 50;
        else
            return 0;
    }
    
}
