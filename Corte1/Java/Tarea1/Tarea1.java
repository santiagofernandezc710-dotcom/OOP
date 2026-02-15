/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Santiago Fernández
 */
public class JavaApplication2 
{
        public static void main(String[] args) 
        {
        // crear objetos
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();

        // asignar valores a los atributos
        p1.nombre = "Santiago Fernandez Calvo";
        p1.edad = 17;

        p2.nombre = "Cristiano Ronaldo Dos Santos Aveiro";
        p2.edad = 42;

        p3.nombre = "Lionel Andres Messi";
        p3.edad = 38;

        // llamar al método
        p1.saludar();
        p2.saludar();
        p3.saludar();
    }
}

// Clase Persona dentro del mismo archivo
class Persona {
    public String nombre;
    public int edad;

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

