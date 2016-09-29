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
public class Electrodomestico {
    
    private double precioBase=100.00;
    private String color="BLANCO";
    private double peso=5.00;
    private char consumoEnergetico='F';
    
    public Electrodomestico(){
        
    }
    
    public Electrodomestico(double precio,double peso){
        
        this.peso=peso;
        this.precioBase=precio+this.precioFinal();
    }
    
    public Electrodomestico(double precio,double peso,char consumo,String color){
        
        this.peso=peso;
        this.consumoEnergetico=this.comprobarConsumoEnergetico(consumo);
        this.color=this.comprobarColor(color);
        this.precioBase=precio+this.precioFinal();
    }
    
    public double getPrecioBase(){
        return this.precioBase;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public char getConsumoEnergetico(){
        return this.consumoEnergetico;
    }
    
    private char comprobarConsumoEnergetico (char c){
        switch (Character.toUpperCase(c)){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F': return Character.toUpperCase(c);
            default: return 'F';
        }
    }
    
    private String comprobarColor(String s){
        switch (s.toUpperCase()){
            case "BLANCO":
            case "NEGRO":
            case "ROJO":
            case "AZUL":
            case "GRIS": return s.toUpperCase();
            default: return "BLANCO";   
        }
    }
    
    private double precioFinal(){
        
        double incremento=0;
        
        switch (this.consumoEnergetico){
            case 'A':incremento+=100;break;
            case 'B':incremento+=80;break;
            case 'C':incremento+=60;break;
            case 'D':incremento+=50;break;
            case 'E':incremento+=30;break;
            case 'F':incremento+=10;break;
        }
        
        if (this.peso<20)
            incremento+=10;
        else if (this.peso<50)
            incremento+=50;
        else if (this.peso<80)
            incremento+=80;
        else
            incremento+=100;
        
        return incremento;
        
    }
}
