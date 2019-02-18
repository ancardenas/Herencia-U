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
public class Tecnologico extends Sede{
    private int noEstudiantes;

    public Tecnologico(int noEstudiantes, String Nombre, String Direccion, int Telefono, double AreaConstruida, HashMap<String, PersonaBachiller> estudiante) {
        super(Nombre, Direccion, Telefono, AreaConstruida, estudiante);
        this.noEstudiantes = noEstudiantes;
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
    public Tecnologico darInformacion() {
        System.out.println("Numero de Estudiantes: ");
        System.out.print(this.noEstudiantes);
        System.out.println("Nombre de la Sede: ");
        System.out.print(this.getNombre());
        System.out.println("Direccion de la Sede: ");
        System.out.print(this.getDireccion());
        System.out.println("Telefono de la Sede: ");
        System.out.print(this.getTelefono());
        System.out.println("Area Constuida de la Sede: ");
        System.out.print(this.getAreaConstruida());
        /*Imprimir el HashMap de estudiantes
        System.out.println();
        */
        Tecnologico a;
        a = new Tecnologico( this.noEstudiantes,this.getNombre(), this.getDireccion(),this.getTelefono(),this.getAreaConstruida(),this.getestudiantes());
     
        return a;
    }
    
}
