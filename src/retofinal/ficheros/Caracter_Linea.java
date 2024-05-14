/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retofinal.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *Se utiliza para leer y escribir datos que están codificados en algún formato 
 * de caracteres específico, como archivos de texto.
 *FileReader tiene métodos que nos permiten leer caracteres. suele ser habitual 
 * querer las líneas completas, bien porque nos interesa la línea completa, 
 * bien para poder analizarla luego y extraer campos de ella.
 *Lectura FileReader con BufferedReader y readLine
 *FileWriter con BufferedWriter y write  o print/println (true opcional)
 */
public class Caracter_Linea {
    public static void leerArchivoCarLin(String nombreArchivo) {
        BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea); // Convertir el byte a char y mostrarlo en pantalla
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
            if (br != null)
                try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar" + ex.toString());
            }
        }
    }
    
    /**
     * 
     * @param nombreArchivo nombre del archivo donde se escribe
     * @param contenido frase a escribir
     */
    public static void escribirArchivoCarLin(String nombreArchivo, String contenido) {
         BufferedWriter br = null;       
        try {

            br = new BufferedWriter(new FileWriter(nombreArchivo));
            br.write(contenido); //esctibimos en el archivo
            br.newLine();//hacemos salto de linea, quitar si se quiere
            //parametro true opcional (no pisa el archivo y escribe al final de este)
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
       
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            if (br != null)
                try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar"+ ex.toString());
            }
        }
    }  
}
         

