/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherenciasedesu;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
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
     * Se uso como formato de guardado la serializacion
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        /**
         * Los objetos siguientes son todos los necesarios para escribir y leer un archivo serializado
         */
        File objetos = new File("objetos.txt");
        FileInputStream entrada =null;
        FileOutputStream salida =null;
        ObjectInputStream reader = null;
        ObjectOutputStream writer =null;
        //Universidad UN = null;
        /**
         * Necesaria inicializacion de la universidad para evitar el null pointer exception
         */
        Universidad UN = new Universidad("UN");
        //UN.setSedes("Bogota", new Profesional("Bogota", "Ciudad universitaria", 34243, 32235));
        /**
         * Lectura del archivo se hace al principio de la ejecucion para evitar perder informacion
         */
        try {
            entrada =new FileInputStream(objetos);
            reader = new ObjectInputStream(entrada);
            UN = (Universidad) reader.readObject();
            System.out.println(UN.getNombre());
            //UN.listSedes();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {while (true){
        System.out.println("Bienvenido a la Universidad Nacional");
        System.out.println("Que desea Hacer?");
        System.out.println("1 Añadir Sede");
        System.out.println("2 Modificar Sede");
        System.out.println("3 Eliminar Sede");
        System.out.println("4 Dar informacion de todas las sedes");
            System.out.println("5 Listar las sedes existentes ");
            System.out.println("6 Salir");
        int a =sc.nextInt();
        
                switch(a){
            
            case 1:try{System.out.println("Ingrese el nombre");
            String Nombre =sc.next();
                System.out.println("Ingrese una direccion");
            String Direccion =sc.next();
                System.out.println("Ingrese el area");
                int are = sc.nextInt();
                System.out.println("Igrese El telefono");
                int tel = sc.nextInt();
                System.out.println("El tipo de la sede es: 1 Profesional, 2 Tecnologico, 3 Educacion continua ");
                int tipo = sc.nextInt();
                UN.añadirSedes(Nombre, Direccion, are, tel, tipo);break;}catch (Exception ex){
                   System.out.println("Los Datos solicitados han sido introducidos de manera incorrecta por favor verifique y vuelva a intentarlo");
                   System.exit(0);
               }case 2: System.out.println("Not implemented yet");break;
               case 3:System.out.println("Ingrese el nombre de la sede que desea eliminar");
               
               UN.eliminarSedes(sc.next());break;
               case 4: System.out.println(" Las sedes y su informacion son las siguientes ");
                   HashMap<String,Sede>  m=UN.getSedes();
               for (Map.Entry<String, Sede> en : m.entrySet()) {
                       String key = en.getKey();
                       m.get(key).darInformacion();
                       System.out.println("");
                   }break;
               case 6: System.exit(0);break;
               case 5: UN.listSedes();break;
               
                
               }
       
        
        System.out.println("Cambio exitoso");
            System.out.println("");
            System.out.println("");
        /**
         * Escritura del archivo se hace cada vez que se realiza un pocedimiento exitoso del anterior switch
         */
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
        
        
    }}catch(Exception ex){
            System.out.println("Vuelva a inentar");
    }
    
}}
