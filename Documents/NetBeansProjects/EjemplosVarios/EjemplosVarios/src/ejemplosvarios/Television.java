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
public class Television extends Electrodomestico {
    
    private double resolucion;
    private boolean sintonizadorTDT;
    
    public Television(){
        super();
        this.resolucion=20.0;
        this.sintonizadorTDT=false;
        super.precioBase+=this.precioFinal();
    }
    
    public Television (double precio,double peso){
        super(precio,peso);
        this.resolucion=20.0;
        this.sintonizadorTDT=false;
    }
    
    public Television (double resolucion,boolean tdt,double precio,double peso,String color,char consumo){
        super(precio,peso,consumo,color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=tdt;
        super.precioBase+=this.precioFinal();
    }
    
    public double getResolucion(){
        return this.getResolucion();
    }
    
    public boolean getSintonizadorTDT(){
        return this.sintonizadorTDT;
    }
    
    public double precioFinal(){
        
        double incremento=0;
        
        if (this.resolucion>=40)
            incremento+=super.precioBase*0.3;
        
        if (this.getSintonizadorTDT())
            incremento+=50;
        
        return incremento;
    }
    
    
}
