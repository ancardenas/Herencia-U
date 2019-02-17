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

  

    public Universidad(String Nombre) {
        this.Nombre = Nombre;
        this.Sedes = new HashMap<>();
    }
    
    public void addsede(){
        
    };

}
