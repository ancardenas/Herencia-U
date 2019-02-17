
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
public abstract  class Sede {

    private String Nombre;
    private String Direccion;
    private  int Telefono;
    private double AreaConstruida;
    private HashMap<String,PersonaBachiller> estudiante;
    
    public Sede(String Nombre, String Direccion, int Telefono, double AreaConstruida, HashMap<String, PersonaBachiller> estudiante) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.AreaConstruida = AreaConstruida;
        this.estudiante = estudiante;
    }
public abstract Sede darInformacion();

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public double getAreaConstruida() {
        return AreaConstruida;
    }

    public void setAreaConstruida(double AreaConstruida) {
        this.AreaConstruida = AreaConstruida;
    }

    public HashMap<String, PersonaBachiller> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(HashMap<String, PersonaBachiller> estudiante) {
        this.estudiante = estudiante;
    }

}
