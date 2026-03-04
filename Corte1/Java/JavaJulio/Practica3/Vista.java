import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista //Creo la clase Vista
{
    //Creo el metodo escribirNumero() para que el programa le diga al usuario que escriba el numero
    public void escribirNumero()
    {
        System.out.print("Escriba un numero.\nSi llega a ser decimal escriba con la (,):\n");
    }

    //Creo el metodo escribirSalida(Numero resultado1) para que el programa imprima el resultado
    public void escribirSalida(Numero resultado1) //El metodo recibe el objeto con su parametro
    {
        System.out.println("El resultado es: " + resultado1.getNumero()); //Solo muestra el resultado pidiendolo con un get
    }

    //Creo el metodo mostrarMenu() para que al Inicio de todo el usuario escoja una opcion
    public void mostrarMenu()
    {
        System.out.println("\n--- Menu de Suma ---");
        System.out.println("1. Realizar una Suma");
        System.out.println("2. Realizar una Resta");
        System.out.println("3. Realizar una Multiplicacion");
        System.out.println("4. Realizar una Division");
        System.out.println("5. Salir");
        System.out.println("Seleccionar una opcion: ");
    }

    //Creo el metodo salirPrograma() para que si el usuario escribio 5 (salir del programa) aparezca impreso antes de que se salga
    public void salirPrograma()
    {
        System.out.println("Saliendo de la aplicacion...");
    }

    //Creo el metodo mostrarDefault() por si el usuario no pone un numero valido
    public void mostrarDefault()
    {
        System.out.println("Opcion no valida. Por favor, intentede nuevo. Del 1 al 5");
    }

    //Creo el errorDivision() por si en division el usuario dijita 0 en el numero 2
    public void errorDivision() 
    {
        System.out.println("Error: No es posible dividir entre cero.");
    }

    //Creo el metodo para evitar errores futuros 
    public int LeerNumero(Scanner entrada)
    {
        int numero = 0;
        boolean entradaValida = false;
        do
        {
            try
            {
                System.out.print("Escriba un Escriba un Numero: ");
                numero = entrada.nextInt();
                entradaValida = true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Error: La entrada no es un numero. Intente de nuevo");
                entrada.nextLine();
            }
        } while (!entradaValida);
        return numero;
    }


}
