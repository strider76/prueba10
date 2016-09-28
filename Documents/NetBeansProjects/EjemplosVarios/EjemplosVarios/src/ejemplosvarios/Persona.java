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
public class Persona {
    
    public final char HOMBRE='H';
    public final char MUJER='M';
    
    private String nombre="";
    private int edad=0;
    private String dni="";
    private char sexo='H'; // H -> hombre, M-> Mujer
    private int peso=0; // en Kg
    private int altura=0; // en cms
    
    public Persona(){

    }
    
    public Persona(String nombre,int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
    }
    
    public Persona (String nombre, String dni, int edad, char sexo, int peso, int altura ){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.dni=dni;
        this.peso=peso;
        this.altura=altura;   
    }
    
    
}
