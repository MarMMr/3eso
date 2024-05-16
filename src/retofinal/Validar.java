/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package retofinal;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Validar { 
    public static Scanner sc = new Scanner(System.in);

    public static String IntroCadenaSoloLetras(String mensaje) {
        String cadena = ""; boolean valido = false; 
        do { 
            try { 
                System.out.println(mensaje); 
                cadena = sc.nextLine().trim(); 
                if (cadena.matches("[a-zA-Z ]+")) valido = true; 
                else System.out.println("Error, introduce una cadena que contenga solo letras"); 
            } catch (InputMismatchException e) { 
                System.out.println("Error, introduce una cadena válida"); 
            } 
        } while (!valido); 
        
        return cadena; 
    }

    public static double IntroDecimal(String mensaje) { 
        double decimal = 0; boolean valido = false; 
        do { 
            try { 
                System.out.println(mensaje); 
                decimal = sc.nextDouble(); 
                valido = true; 
            } catch (InputMismatchException e) { 
                System.out.println("Error, introduce un numero decimal valido"); 
            } finally {
                sc.nextLine(); 
            }
        } while (!valido); return decimal; 
    }

    public static int IntroEntero(String mensaje) { 
        int entero = 0; 
        boolean valido = false; 
        do { 
            try { 
                System.out.println(mensaje); 
                entero = sc.nextInt(); 
            } catch (InputMismatchException e) { 
                System.out.println("Error, introduce un numero entero válido"); 
            }  finally {
                sc.nextLine(); 
            }
        } while (!valido); return entero; }

    public static String ValidaCorreo(String mensaje) {
        String correo = "";
        boolean valido = false;
        do {
            try {
                System.out.println(mensaje);
                correo = sc.nextLine().trim();
                if (correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) 
                    valido = true;
                else
                    System.out.println("Error, introduce un correo electrónico válido");
            } catch (InputMismatchException e) {
                System.out.println("Error, introduce un correo electrónico válido");
            }
        } while (!valido);

        return correo;
    }
 }