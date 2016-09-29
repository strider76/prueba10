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
    
    int longitud;
    String contraseña;
    
    public Password(){
    
        this.longitud=8;
        this.contraseña="";
    }
    
    public Password (int longitud) {
        
        char[] s={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E'
                    ,'F','G','H','I','J','K','L','M','N','O','P','Q','R','S'
                    ,'T','U','W','X','Y','Z','a','b','c','d','e','f','g','h'
                    ,'i','j','k','l','m','n','o','p','q','r','s','t','u','w'
                    ,'x','y','z'};
        Random ra=new Random();
        for (int i=0;i<longitud;i++){
            this.contraseña+=s[ra.nextInt(s.length)];
        }
    }
    
    
}
