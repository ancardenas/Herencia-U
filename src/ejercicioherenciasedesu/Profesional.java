/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherenciasedesu;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Valentine Chimezie
 */
public class Profesional extends Sede implements Serializable{
  private int noProgAltaC;  
  private HashMap<String,ProgramaDeFormacion>Programas;
  private Tecnologico SedeTecnologica;
  private EducacionContinuada SedeEducacionContinuada;

    public Profesional(int noProgAltaC, String Nombre, String Direccion, int Telefono, double AreaConstruida, HashMap<String, PersonaBachiller> estudiantes) {
        super(Nombre, Direccion, Telefono, AreaConstruida, estudiantes);
        this.noProgAltaC= noProgAltaC;
    }

    public Profesional(String Nombre, String Direccion, int Telefono, double AreaConstruida, HashMap<String, PersonaBachiller> estudiantes) {
        super(Nombre, Direccion, Telefono, AreaConstruida, estudiantes);
    }

    public Profesional(String Nombre, String Direccion, int Telefono, double AreaConstruida) {
        super(Nombre, Direccion, Telefono, AreaConstruida);
    }
    
/*Implementar el metodo que lista los programas ofrecidos en las posibles sedes tecnologicas 
 y estudio continuo. Nota: Debe devolver un HashMap DONE*/
         
   private void ProgramasTyC(){
       
       HashMap<String,ProgramaDeFormacion> x=new HashMap<>();
       x=this.SedeTecnologica.getProgramas();
       for (Map.Entry<String, ProgramaDeFormacion> entry : x.entrySet()) {
           String key = entry.getKey();
           System.out.println(key);
           
       }
       x=this.Programas;
       for (Map.Entry<String, ProgramaDeFormacion> entry : x.entrySet()) {
           String key = entry.getKey();
           System.out.println(key);   
       }
               
       
    
           
}
    @Override
    public void darInformacion() {
     System.out.print("Numero de Programas: ");
        System.out.println(this.noProgAltaC);
        System.out.print("Nombre de la Sede: ");
        System.out.println(this.getNombre());
        System.out.print("Direccion de la Sede: ");
        System.out.println(this.getDireccion());
        System.out.print("Telefono de la Sede: ");
        System.out.println(this.getTelefono());
        System.out.print("Area Constuida de la Sede: ");
        System.out.println(this.getAreaConstruida());
        /*Imprimir el HashMap de estudiantes
        System.out.println();
        */
        
    }

   
  
  
}
