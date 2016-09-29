/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosvarios;
import java.util.Scanner;

/**
 *
 * @author strider
 */
public class EjemplosVarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        int peso;
        int altura;
        char sexo;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca Nombre: ");
        nombre=sc.nextLine();
        System.out.println("Introduzca Edad: ");
        edad=sc.nextInt();
        System.out.println("Introduzca Peso: ");
        peso=sc.nextInt();   
        System.out.println("Introduzca Altuta: ");
        altura=sc.nextInt();
        System.out.println("Introduzca Sexo (H/M): ");
        sexo=sc.next().charAt(0);  
        
        Persona persona1,persona2,persona3;
        persona1=new Persona(nombre,edad,sexo,peso,altura);
        persona2=new Persona(nombre,edad,sexo);
        persona3=new Persona();
        
        persona2.setPeso(peso);
        persona2.setAltura(altura);
        
        persona3.setNombre(nombre);
        persona3.setAltura(altura);
        persona3.setEdad(edad);
        persona3.setPeso(peso);
        
        System.out.println("Informacion PERSONA1");
        System.out.println(persona1.toString());
        
        System.out.println("Informacion PERSONA2");
        System.out.println(persona2.toString());
        
        System.out.println("Informacion PERSONA3");
        System.out.println(persona3.toString());
        
        System.out.println("La Persona1 es "+ ((persona1.esMayorDeEdad())?"mayor":"menor")+" de edad");
        System.out.println("La Persona2 es "+ ((persona2.esMayorDeEdad())?"mayor":"menor")+" de edad");
        System.out.println("La Persona3 es "+ ((persona3.esMayorDeEdad())?"mayor":"menor")+" de edad");
        
        System.out.println("Introduzca longitud de la lista: ");
        int longitud=sc.nextInt();
        Password[] lista=new Password[longitud];
        boolean[] arrayEsFuerte=new boolean[longitud];
        System.out.println("Introduzca la longitud de los password: ");
        int longPassword=sc.nextInt();
        
        for (int i=0;i<longitud;i++){
            lista[i]=new Password(longPassword);
            arrayEsFuerte[i]=lista[i].esFuerte();
            System.out.println("Clave "+(i+1)+": "+lista[i].getPassword()+" clave "+ ((arrayEsFuerte[i])?"Fuerte":"Debil"));
        }
        
        
        
        
        
    }
    
}
