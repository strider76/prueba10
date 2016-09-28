/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosvarios;
import java.util.Random;

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
           this.generarDNI();
    }
    
    public Persona(String nombre,int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.comprobarSexo(sexo);
        this.generarDNI();
    }
    
    public Persona (String nombre, int edad, char sexo, int peso, int altura ){
        this.nombre=nombre;
        this.edad=edad;
        this.comprobarSexo(sexo);
        this.generarDNI();
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
    
    /**
     *
     * override del metodo toString
     * @return cadena
     */
    @Override
    public String toString(){
        
        String cadena="";
        
        cadena+="Nombre: "+this.nombre+"\n";
        cadena+="DNI: "+this.dni+"\n";
        cadena+="Sexo: "+ ((this.sexo==this.HOMBRE)?"HOMBRE":"MUJER")+"\n";
        cadena+="Edad: "+ this.edad + " años\n";
        cadena+="Peso: "+ this.peso + " Kg.\n";
        cadena+="Altura: "+ this.altura + " cms.\n";
        
        return cadena;
        
    }
    
    private void generarDNI(){
        String dni="";
        Random aleatorio=new Random();
        final int INICIO=65;
        
        for (int i=0;i<8;i++){
            dni+=aleatorio.nextInt(9);
        }
        dni+=(char) (INICIO+aleatorio.nextInt(25));
        
        this.dni=dni;
    }
    
}
