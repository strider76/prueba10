/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automoviles;

/**
 *
 * @author strider
 */
public class Coche {
    
    private String matricula;
    private String marca;
    private String modelo;
    private int cilindrada;
    
    public Coche (String matricula, String marca, String modelo, int cilindrada){
        
    }
    
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public String getMarca(){
        return this.marca;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }

    public void setCilindrada(int cilindrada){
        this.cilindrada=cilindrada;
    }
    
    public int getCilindrada(){
        return this.cilindrada;
    }
    
}
