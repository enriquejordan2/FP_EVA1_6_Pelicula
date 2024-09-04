/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_6_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String Genero;
        int Duracion;
        String reparto;
        String Clasificacion;
        
        Scanner captura;
        
        captura = new Scanner (System.in);
        
        System.out.println("Introduce el nombre de la pelicula");
        nombre = captura.nextLine();
        System.out.println("El genero de su pelicula es:");
         Genero = captura.nextLine();
        System.out.println("La Duracion de su pelicula es:");
        Duracion = captura.nextInt();
        captura.nextLine();
        System.out.println("el reparto de la pelicula: ");
        reparto = captura.nextLine();
        
        System.out.println("La calsificacion es: ");
        Clasificacion = captura.nextLine();
        
        System.out.println("------DATOS CAPTURADOS------");
        System.out.println(nombre);
        System.out.println(Genero);
        System.out.println(Duracion);
        System.out.println(reparto);
        System.out.println(Clasificacion);
        
    }
    
}
