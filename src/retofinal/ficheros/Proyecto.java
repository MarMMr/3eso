/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retofinal.ficheros;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class Proyecto implements Serializable{
    private String nombre;
    private String descripcion;
   

    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
    
}