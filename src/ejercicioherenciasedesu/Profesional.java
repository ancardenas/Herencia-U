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
public class Profesional extends Sede {
  private int numProgramas;  
  private HashMap<String,ProgramaDeFormacion>Programas;
  private Tecnologico SedeTecnologica;
  private EducacionContinuada SedeEducacionContinuada;

    public Profesional(int numProgramas, String Nombre, String Direccion, int Telefono, double AreaConstruida, HashMap<String, PersonaBachiller> estudiante) {
        super(Nombre, Direccion, Telefono, AreaConstruida, estudiante);
        this.numProgramas = numProgramas;
    }

    @Override
    public Sede darInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
  
  
}
