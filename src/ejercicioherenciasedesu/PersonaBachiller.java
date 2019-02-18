/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherenciasedesu;

import java.io.Serializable;

/**
 *
 * @author Valentine Chimezie
 */
public class PersonaBachiller implements Serializable{
   private String Nombre;
   private String Apellido;
   private String  Colegio;
   private int AnnoGrado;
   private Sede Programa;

    public PersonaBachiller(String Nombre, String Apellido, String Colegio, int AnnoGrado) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Colegio = Colegio;
        this.AnnoGrado = AnnoGrado;
    }

   
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getColegio() {
        return Colegio;
    }

    public void setColegio(String Colegio) {
        this.Colegio = Colegio;
    }

    public int getAnnoGrado() {
        return AnnoGrado;
    }

    public void setAnnoGrado(int AnnoGrado) {
        this.AnnoGrado = AnnoGrado;
    }

    public Sede getPrograma() {
        return Programa;
    }

    public void setPrograma(Sede Programa) {
        this.Programa = Programa;
    }
   
   
}
