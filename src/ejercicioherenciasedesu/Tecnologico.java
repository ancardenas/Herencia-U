/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherenciasedesu;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Valentine Chimezie
 */
public class Tecnologico extends Sede implements Serializable{
    private int noEstudiantes;
    private HashMap<String,ProgramaDeFormacion>Programas;
    public Tecnologico(int noEstudiantes, String Nombre, String Direccion, int Telefono, double AreaConstruida, HashMap<String, PersonaBachiller> estudiante) {
        super(Nombre, Direccion, Telefono, AreaConstruida, estudiante);
        this.noEstudiantes = noEstudiantes;
    }
    public void addPrograma(String nom,ProgramaDeFormacion programa){
        this.Programas.put(nom, programa);
    }

    public Tecnologico(String Nombre, String Direccion, int Telefono, double AreaConstruida, HashMap<String, PersonaBachiller> estudiante) {
        super(Nombre, Direccion, Telefono, AreaConstruida, estudiante);
    }

    public Tecnologico(String Nombre, String Direccion, int Telefono, double AreaConstruida) {
        super(Nombre, Direccion, Telefono, AreaConstruida);
    }

    public int getNoEstudiantes() {
        return noEstudiantes;
    }

    public void setNoEstudiantes(int noEstudiantes) {
        this.noEstudiantes = noEstudiantes;
    }

   
    @Override
    public void darInformacion() {
        System.out.print("Numero de Estudiantes: ");
        System.out.println(this.noEstudiantes);
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
        Tecnologico a;
        a = new Tecnologico( this.noEstudiantes,this.getNombre(), this.getDireccion(),this.getTelefono(),this.getAreaConstruida(),this.getestudiantes());
     
        
    }

    public HashMap<String, ProgramaDeFormacion> getProgramas() {
        return Programas;
    }
    
}
