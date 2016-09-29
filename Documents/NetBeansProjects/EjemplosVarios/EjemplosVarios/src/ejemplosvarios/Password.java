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
public class Password {
    
    private int longitud;
    private String contraseña;
    
    public Password(){
    
        this.longitud=8;
        this.contraseña="";
    }
    
    public Password (int longitud) {
        
        this.longitud=longitud;
        this.contraseña=this.generarPassword(longitud);
        
    }
    
    public boolean esFuerte(){
        int mayusculas=0;
        int minusculas=0;
        int numeros=0;
        
        for (int i=0;i<this.longitud;i++){
            if  (Character.isDigit(this.contraseña.charAt(i))==false){
                if (Character.isLowerCase(this.contraseña.charAt(i)))
                    minusculas++;
                else
                    mayusculas++;
                
            } else {
                numeros++;
            }
        }
        
        if ((mayusculas>=2)&&(minusculas>=1)&&(numeros>=5))
            return true;
        else
            return false;
    }
    
    public String generarPassword (int longitud){
        
        String clave="";
        char[] s={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E'
                    ,'F','G','H','I','J','K','L','M','N','O','P','Q','R','S'
                    ,'T','U','W','X','Y','Z','a','b','c','d','e','f','g','h'
                    ,'i','j','k','l','m','n','o','p','q','r','s','t','u','w'
                    ,'x','y','z'};
        Random ra=new Random();
        for (int i=0;i<longitud;i++){
            clave+=s[ra.nextInt(s.length)];
        }
        return clave;
    }
    
    public String getPassword(){
        return this.contraseña;
    }
    
    public int getLongitud(){
        return this.longitud;
    }
    
    public void setLongitud(int longitud){
        this.longitud=longitud;
        this.contraseña=this.generarPassword(longitud);
    }
}
