/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherenciasedesu;

import java.util.HashMap;

/**
 *
 * @author Valentine Chimezie
 */
public class Universidad {
    private String Nombre;
    private HashMap<String,Sede> Sedes;
    private HashMap<String,PersonaBachiller> Estudiantes;

    public Universidad(String Nombre) {
        this.Nombre = Nombre;
        this.Sedes = new HashMap<>();
        
    }

   private void AñadirSedes(String Nombre,String Direccion,double AreaConstruida,int Telefono,int Tipo){
       switch (Tipo){
           case 1: this.Sedes.put(Nombre, new Profesional(Nombre,Direccion,Telefono,AreaConstruida ));
       break;
        case 2: this.Sedes.put(Nombre, new Tecnologico(Nombre,Direccion,Telefono,AreaConstruida ));
        break;
        case 3: this.Sedes.put(Nombre, new EducacionContinuada(Nombre,Direccion,Telefono,AreaConstruida ));
       break;
       }
   } 
    private void EliminarSedes(String Nombre){
        this.Sedes.remove(Nombre);
    }
    //Definan ustedes este metodo
    private void ModificarSede(String Nombre){
        
    }
    private Sede InformacionSede(String Nombre){
       
      this.Sedes.get(Nombre).darInformacion();
      //SI QUIEREN IMPRIMIR EL HASHMAP DE ESTUDIANTES LO DEJO A SU DECISION 
    return this.Sedes.get(Nombre);
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public HashMap<String, Sede> getSedes() {
        return Sedes;
    }

    public void setSedes(HashMap<String, Sede> Sedes) {
        this.Sedes = Sedes;
    }

    public HashMap<String, PersonaBachiller> getEstudiantes() {
        return Estudiantes;
    }

    public void setEstudiantes(HashMap<String, PersonaBachiller> Estudiantes) {
        this.Estudiantes = Estudiantes;
    }
    
  


    


}
