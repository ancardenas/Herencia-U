/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherenciasedesu;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author Valentine Chimezie
 */
public class Universidad implements Serializable {
    private String Nombre;
    private HashMap<String,Sede> Sedes;
    private HashMap<String,PersonaBachiller> Estudiantes;
    //private final Scanner sc =new Scanner(System.in);
    public Universidad(String Nombre) {
        this.Nombre = Nombre;
        this.Sedes = new HashMap<>();
        
    }

   public void añadirSedes(String Nombre,String Direccion,double AreaConstruida,int Telefono,int Tipo){
       switch (Tipo){
           case 1: this.Sedes.put(Nombre, new Profesional(Nombre,Direccion,Telefono,AreaConstruida ));
       break;
        case 2: this.Sedes.put(Nombre, new Tecnologico(Nombre,Direccion,Telefono,AreaConstruida ));
        break;
        case 3: this.Sedes.put(Nombre, new EducacionContinuada(Nombre,Direccion,Telefono,AreaConstruida ));
       break;
       }
   } 
    public void eliminarSedes(String Nombre){
        this.Sedes.remove(Nombre);
    }
    //Definan ustedes este metodo Done
    public void modificarSede(String Nombre){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 Area");
        System.out.println("2 Direccion");
        System.out.println("3 Nombre");
        System.out.println("4 Telefono");
        int opcion = sc.nextInt();
        
        switch(opcion){
            
            
            case 1:System.out.println("Ingrese el area de la sede"); 
                this.Sedes.get(Nombre).setAreaConstruida(sc.nextInt());break;
            case 2:System.out.println("Ingrese Direccion");
                this.Sedes.get(Nombre).setDireccion(sc.next());break;
            case 3: System.out.println("Ingrese el nuevo nombre"); 
            String nom = sc.next();
            this.Sedes.get(Nombre).setNombre(nom);
            Sede aux = this.Sedes.get(Nombre);
            this.Sedes.remove(Nombre);
            this.Sedes.put(nom, aux);break;
            case 4: System.out.println("Ingrese el nuevo telefono");
            this.Sedes.get(Nombre).setTelefono(sc.nextInt());break;
            
            
            
    }
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
    public void listSedes(){
        for (Map.Entry<String, Sede> entry : Sedes.entrySet()) {
            String key = entry.getKey();
            System.out.println(Sedes.get(key).getNombre());
            
        }
    }
    

    public void setSedes(String nombre, Sede sede) {
        this.Sedes.put(nombre, sede);
    }

    public HashMap<String, PersonaBachiller> getEstudiantes() {
        return Estudiantes;
    }

    public void setEstudiantes(HashMap<String, PersonaBachiller> Estudiantes) {
        this.Estudiantes = Estudiantes;
    }
    
  


    


}
