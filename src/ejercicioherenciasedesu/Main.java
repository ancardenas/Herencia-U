/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherenciasedesu;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
/**
 *
 * @author Valentine Chimezie
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        File objetos = new File("objetos.txt");
        FileInputStream entrada =null;
        FileOutputStream salida =null;
        ObjectInputStream reader = null;
        ObjectOutputStream writer =null;
        //Universidad UN = null;
        Universidad UN = new Universidad("UN");
        //UN.setSedes("Bogota", new Profesional("Bogota", "Ciudad universitaria", 34243, 32235));
        try {
            entrada =new FileInputStream(objetos);
            reader = new ObjectInputStream(entrada);
            UN = (Universidad) reader.readObject();
            System.out.println(UN.getNombre());
            UN.listSedes();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Bienvenido a la Universidad Nacional");
        System.out.println("Que desea Hacer?");
        System.out.println("1 Añadir Sede");
        System.out.println("2 Modificar Sede");
        System.out.println("3 Eliminar Sede");
        System.out.println("4 Dar informacion de todas las sedes");
        int a =sc.nextInt();
        
               switch(a){
            
            case 1:System.out.println("Ingrese el nombre");
            String Nombre =sc.next();
                System.out.println("Ingrese una direccion");
            String Direccion =sc.next();
                System.out.println("Ingrese el area");
                int are = sc.nextInt();
                System.out.println("Igrese El telefono");
                int tel = sc.nextInt();
                System.out.println("El tipo de la sede es: 1 Profesional, 2 Tecnologico, 3 Educacion continua ");
                int tipo = sc.nextInt();
                UN.añadirSedes(Nombre, Direccion, are, tel, tipo); break;
              }
                
            
       
        
        System.out.println("Escribir archivo");
        try {
            salida =new FileOutputStream(objetos);
            writer =new ObjectOutputStream(salida);
            writer.writeObject(UN);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            System.err.println("Null pointer");
        }
        
        
    }
    
}
