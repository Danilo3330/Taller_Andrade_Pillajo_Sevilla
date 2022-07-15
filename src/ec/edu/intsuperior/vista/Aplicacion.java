
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.util.Date;

public class Aplicacion {
    public static void main(String[] args) {
    Persona p1= new Persona();
    Date fec= new Date();
    fec.setYear(2003);
    fec.setMonth(12);
    fec.setDate(26);
    Persona p2= new Persona("1750796250","Anthony","Danilo","Sevilla","Segura","Turubamba Bajo", fec, "sevillaa847@gmail.com");
       System.out.println("Fecha de nacimiento; " + p2.getFechaNacimiento().getYear()+ "/" + p2.getFechaNacimiento().getMonth()+"/"+p2.getFechaNacimiento().getDate());
       
    }
    
    
}
