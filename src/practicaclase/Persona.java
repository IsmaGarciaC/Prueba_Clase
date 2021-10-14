/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaclase;

import java.util.Scanner;

/**
 *
 * @author Ismael
 */
public class Persona {
   
    private String idPersona;
    private String nombre;
    private String apellido;
    private String genero;
    private String fecha;
    private String cedula;
    private String edad;
    
    
    public void ingresarDatos (){
        
        System.out.println("Ingresar su ID / 12345");
        Scanner leer = new Scanner (System.in);
        idPersona = leer.nextLine();
        
        System.out.println("Ingrese su Nombre");
        nombre = leer.nextLine();
        
        System.out.println("Ingrese su Apellido");
        apellido = leer.nextLine();
        
        System.out.println("Ingrese su Genero / Masculino-Femenino");
        genero = leer.nextLine();
        
        System.out.println("Ingrese su fecha de Nacimiento / dd-mm-aa");
        fecha = leer.nextLine();
        
        System.out.println("Ingrese su numero de Cedula");
        cedula = leer.nextLine();
        
        System.out.println("Ingrese su Edad");
        edad = leer.nextLine();
        //muestra el resultado
        System.out.println("-------------------------------");
        System.out.println("Los datos de la Persona son : ");
        System.out.println("- ID: "+idPersona);
        System.out.println("- Name: "+nombre);
        System.out.println("- Last Name: "+apellido);
        System.out.println("- Gender: "+genero);
        System.out.println("- Date of Birth: "+fecha);
        System.out.println("- ID Card: "+cedula);
        System.out.println("--------------------------------");
        System.out.println("              FIN");
    }
}
