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
public class EducacionContinuada extends Sede implements Serializable{
private String CursoMasPopular;

    public EducacionContinuada(String CursoMasPopular, String Nombre, String Direccion, int Telefono, double AreaConstruida, HashMap<String, PersonaBachiller> estudiantes) {
        super(Nombre, Direccion, Telefono, AreaConstruida, estudiantes);
        this.CursoMasPopular = CursoMasPopular;
    }

    public EducacionContinuada(String Nombre, String Direccion, int Telefono, double AreaConstruida, HashMap<String, PersonaBachiller> estudiantes) {
        super(Nombre, Direccion, Telefono, AreaConstruida, estudiantes);
    }

    public EducacionContinuada(String Nombre, String Direccion, int Telefono, double AreaConstruida) {
        super(Nombre, Direccion, Telefono, AreaConstruida);
    }

    public String getCursoMasPopular() {
        return CursoMasPopular;
    }

    public void setCursoMasPopular(String CursoMasPopular) {
        this.CursoMasPopular = CursoMasPopular;
    }

    @Override
    public void darInformacion() {
        System.out.print("Curso mas Popular: ");
        System.out.println(this.CursoMasPopular);
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
        EducacionContinuada a;
        a = new EducacionContinuada(this.CursoMasPopular, this.getNombre(), this.getDireccion(),this.getTelefono(),this.getAreaConstruida(),this.getestudiantes());
     
        
    }
    
    
}
