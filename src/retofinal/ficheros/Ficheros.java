/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package retofinal.ficheros;

import java.util.List;

/**
 *
 * @author jorge
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ejemplos de como se ejecutan todos
        
        //byte
          byte[] byteArray = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100}; // "Hello World" en ASCII
          TipoByte.escribirArchivoByte("ArchivoBytes",byteArray);
          //leemos y escribimos en pantalla
          TipoByte.leerArchivoByte("ArchivoBytes");
          
          //caracter_linea
          String frase="hola soy jorge";
          Caracter_Linea.escribirArchivoCarLin("ArchivoCarLin", frase);
           //leemos y escribimos en pantalla
          Caracter_Linea.leerArchivoCarLin("ArchivoCarLin");
          
          //Binario
          String nombre="jorge";
          int edad=12;
          Binarios.escribirArchivoBin(nombre, edad, "ArchivoBinario");
          //leemos y escribimos en pantalla
          Binarios.leerArchivoBin("archivoBinario");
          
         //objetos
         Proyecto pro=new Proyecto ("proyectoJorge", "trata sobre mi vida");
         Objetos.escribirArchivoObjetos("ArchivoObjetos", pro);
         //leemos el fichero, recuperamos la lista que nos devuelve y la imprimimos
         List recuperada=Objetos.leerArchivoObjetos("ArchivoObjetos");
         
         for (Object objeto: recuperada){
             Proyecto proyec=(Proyecto)objeto;
             System.out.println(proyec);
         }
    }
    
}
