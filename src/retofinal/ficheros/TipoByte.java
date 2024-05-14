/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retofinal.ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Se utiliza principalmente para leer y escribir datos binarios o datos que no 
 * están codificados en ningún formato de caracteres específico, como archivos 
 * de imagen, audio, video, etc.
 *LecturaFileInputStream y read
 *EscrituraFileOutputStream y write  (true opcional)
**/
public class TipoByte {
    
    /**
     *  Método para leer un archivo byte a byte, 
     *  lo escribe en pantalla
     * @param nombreArchivo nombre del archivo a leer
     */
    public static void leerArchivoByte(String nombreArchivo) {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream(nombreArchivo) ;
            int byteLeido;
            while ((byteLeido = fis.read()) != -1) {
                System.out.print((char) byteLeido); // Convertir el byte a char y mostrarlo en pantalla
                /**
                 * codigo para tratar los datos como se quiera
                 */
                
            }
            System.out.println("\nLectura de archivo completada.");
        }
         catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
         }catch (IOException e) {
            e.printStackTrace();
        }
         finally {
            if (fis != null)
                try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar" + ex.toString());
            }
        }
    }

    
    /**
     * Método para escribir en un archivo byte a byte
     * @param nombreArchivo nombre del archivo a escribir
     * @param bytes Array de bytes a escribir
     */
    public static void escribirArchivoByte(String nombreArchivo, byte[] bytes) {
       FileOutputStream fos=null;
        try {
            fos = new FileOutputStream(nombreArchivo);
                 
            fos.write(bytes);
            /**
             * int write( int c ): Escribe el carácter en el fichero. 
             * int write( byte a[] ): Escribe el contenido del vector en el fichero. 
             * int write( byte a[], int off, int len ): Escribe len caracteres del vector a en el fichero, 
             *      comenzando desde la posición off. 
             */
            //parametro true opcional (no pisa el archivo y escribe al final de este)
     
            System.out.println("Escritura en archivo completada.");
        } 
        catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fos != null)
                try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar" + ex.toString());
            }
        }
    }
    
}
