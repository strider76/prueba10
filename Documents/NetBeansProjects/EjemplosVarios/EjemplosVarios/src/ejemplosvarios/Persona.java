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
    
    public final int SOBREPESO=1;
    public final int PESOIDEAL=0;
    public final int INFRAPESO=-1;
    
    private String nombre="";
    private int edad=0;
    private String dni="";
    private char sexo=this.HOMBRE; // H -> hombre, M-> Mujer
    private int peso=0; // en Kg
    private int altura=0; // en cms
    
    public Persona(){

    }
    
    public Persona(String nombre,int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.comprobarSexo(sexo);
    }
    
    public Persona (String nombre, String dni, int edad, char sexo, int peso, int altura ){
        this.nombre=nombre;
        this.edad=edad;
        this.comprobarSexo(sexo);
        this.dni=dni;
        this.peso=peso;
        this.altura=altura;   
    }
    
    public int calcularIMC(){
        
        double imc;
        
        if (this.altura==0)
            return this.INFRAPESO;
        else {
            imc=this.peso/Math.pow(this.altura/100,2);
            if (imc<18)
                return this.INFRAPESO;
            else if ((imc>=18)&&(imc<25))
                return this.PESOIDEAL;
            else
                return this.SOBREPESO;
        }

    }

    public boolean esMayorDeEdad(){
        return this.edad>=18;
    }
    
    private void comprobarSexo(char sexo){
        if ((sexo!=this.HOMBRE) && (sexo!=this.MUJER))
            this.sexo=this.HOMBRE;
        else
            this.sexo=sexo;
    }
    
}
