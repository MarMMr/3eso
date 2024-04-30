/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retofinal.ficheros;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *para tipos primitivos (bolean, byte, int, double..) y recuperarlos como tal
 *Lectura FileInputStream con DataIntputStream y 
    •readBoolean(): Devuelve un valor de tipo booleno 
    •readByte(): Devuelve un valor de tipo byte 
    •readChar(): Devuelve un valor de tipo char 
    •readShort(): Devuelve un valor de tipo short 
    •readInt(): Devuelve un valor de tipo int 
    •readLong(): Devuelve un valor de tipo long 
    •readDouble(): Devuelve un valor de tipo double 
    •readFloat(): Devuelve un valor de tipo float 
    •readUTF(): Devuelve una cadena de caracteres en formato UTF-8
escritura FileOutputStream con  DataOutputStream y 
    •writeBoolean(): Escribe un valor de tipo booleno 
    •writeByte(): Escribe un valor de tipo byte 
    •writeChar(): Escribe un valor de tipo char 
    •writeShort(): Escribe un valor de tipo short 
    •writeInt(): Escribe un valor de tipo int 
    •writeLong(): Escribe un valor de tipo long 
    •writeDouble(): Escribe un valor de tipo double 
    •writeFloat(): Escribe un valor de tipo float 
    •writeUTF(): Escribe una cadena de caracteres en formato UTF-8
*/


public class Binarios {
    
    /**
     * 
     * @param nombre string a escribir en el archivo
     * @param edad entero a escribir en el archivo
     * param nombreArchivo nombre del archivo donde se escribe
     */
    public static void escribirArchivoBin(String nombre, int edad,String nombrefichero) {
        
        DataOutputStream fd = null;
        File archivo=new File(nombrefichero);
        try {
   
            fd = new DataOutputStream(new FileOutputStream(nombrefichero));
            
            fd.writeUTF(nombre);
            fd.writeInt(edad);
            /**
            * por ej para escribir un objeto Persona en UTF de la lista personas
            *  for(Persona persona:personas){
            *      fd.writeUTF(persona.toString());
            *  }
            */
            
        }catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
         } catch (IOException ex) {
            System.out.println("error " + ex.toString());
        } finally {
            if (fd != null) {
                try {
                    fd.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar"+ex.toString());
                }
            }
        }
    }
    /**
     * lee el fichero de personas
     * @param file - fichero de persona
     *
     */
    public static void leerArchivoBin(String nombrefichero) {
        String nombre;
        int edad;
        DataInputStream fd = null;
        File archivo=new File(nombrefichero);
        try {
            //creamos un flujo hacia el fichero
            fd = new DataInputStream(new FileInputStream(archivo));
             while (true) {
                try {
                    /**
                    * ej lectura de persona
                    *  do {
                    *     persona = fd.readUTF();
                    *     System.out.println(persona);
                    *  } while (!fin);
                    */
                    nombre = fd.readUTF();
                    edad = fd.readInt();
                    System.out.println("Nombre: " + nombre + ", Edad: " + edad);
                } catch (EOFException e) {
                    System.out.println(" Se alcanzó el final del archivo");
                    break;
                }
            }
        } catch (IOException ex) {
            System.out.println("error " + ex.toString());
        } finally {
            if (fd != null) {
                try {
                    fd.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar"+ex.toString());
                }
            }
        }
    }
    
}
