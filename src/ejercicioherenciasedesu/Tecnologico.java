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

    /**
     *
     * @return
     */
    @Override
    public Tecnologico darInformacion() {
        System.out.println(this.noEstudiantes);
        System.out.println(this.getNombre());
        
        Tecnologico a;
        a = new Tecnologico(this.noEstudiantes, this.getNombre(), this.getDireccion(),this.getTelefono(),this.getAreaConstruida(),this.getEstudiante());
     
        return a;
    }
    
}
