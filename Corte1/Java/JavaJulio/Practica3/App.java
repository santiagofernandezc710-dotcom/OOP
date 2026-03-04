//Suma,Resta,Multiplicacion,Division.Java
// Programa que recibe dos numeros y muestra la Suma,Resta,Multiplicacion,Division.
import java.util.Scanner;

public class App
{
    //El metodo main empieza la ejecucion de la aplicacion en Java
    public static void main(String[] args) 
    {
        //Crea el objeto Scanner para obtenerla entrada de la ventana de comando
        Scanner entrada = new Scanner(System.in);
        {
            //Crea el objeto Vista
            Vista vista = new Vista();
            //Variable auxiliar para el switch
            int opcion;

            do //Un doWhile normal
            {
                vista.mostrarMenu();//Muestra el Menu y las opciones al usuario
                try
                {
                    opcion = entrada.nextInt(); // Es la variable que esepera a que el usuario escriba un numero especifico y la guarda

                    switch(opcion)//El switch recibe el numero que tiene guardado la opcion y decide por que camino ir
                    {
                        //En vez de usar case 1: lo cambie en case 1 -> {} quitando el break para que no me tire un warning por el switch
                        case 1: //Si el usuario digita 1 es por que escogio sumar
                        {
                            vista.escribirNumero();  //imprime para avisar al usuario que escriba un numero
                            double n1 = entrada.nextDouble(); //esto lee el primer numero del usuario
                            vista.escribirNumero();  //imprime para avisar al usuario que escriba un numero
                            double n2 = entrada.nextDouble(); //esto lee el segundo numero del usuario

                            //Crea los objetos numeros despues de obtener los valores
                            Numero numero1 = new Numero(n1);
                            Numero numero2 = new Numero(n2);
                            //Crea el objeto suma
                            Suma suma = new Suma(numero1, numero2);
                            Numero resultado = suma.sumar();

                            vista.escribirSalida(resultado); //imprime el resultado
                        }break;

                        case 2: //Si el usuario digita 2 es por que escogio restar
                        {
                            vista.escribirNumero();  //imprime para avisar al usuario que escriba un numero
                            double n1 = entrada.nextDouble(); //esto lee el primer numero del usuario
                            vista.escribirNumero();  //imprime para avisar al usuario que escriba un numero
                            double n2 = entrada.nextDouble(); //esto lee el segundo numero del usuario

                            //Crea los objetos numeros despues de obtener los valores
                            Numero numero1 = new Numero(n1);
                            Numero numero2 = new Numero(n2);
                            //Crea el objeto suma
                            Resta resta = new Resta(numero1, numero2);
                            Numero resultado = resta.restar();

                            vista.escribirSalida(resultado); //imprime el resultado
                        }break;

                        case 3://Si el usuario digita 3 es por que escogio multiplicar
                        {
                            vista.escribirNumero();  //imprime para avisar al usuario que escriba un numero
                            double n1 = entrada.nextDouble(); //esto lee el primer numero del usuario
                            vista.escribirNumero();  //imprime para avisar al usuario que escriba un numero
                            double n2 = entrada.nextDouble(); //esto lee el segundo numero del usuario

                            //Crea los objetos numeros despues de obtener los valores
                            Numero numero1 = new Numero(n1);
                            Numero numero2 = new Numero(n2);
                            //Crea el objeto suma
                            Multiplicacion multiplicacion = new Multiplicacion(numero1, numero2);
                            Numero resultado = multiplicacion.Multiplicar();

                            vista.escribirSalida(resultado); //imprime el resultado
                        }break;

                        case 4: //Si el usuario digita 4 es por que escogio dividir
                        {
                            vista.escribirNumero();  //imprime para avisar al usuario que escriba un numero
                            double n1 = entrada.nextDouble(); //esto lee el primer numero del usuario
                            vista.escribirNumero();  //imprime para avisar al usuario que escriba un numero
                            double n2 = entrada.nextDouble(); //esto lee el segundo numero del usuario

                            if (n2 == 0) //Utilizo un condicional para que si el usuario en el segundo numero dijita un 0 el programa saque un "Error"
                            {
                                vista.errorDivision(); //imprime el error
                            }
                            else //Si el usuario digita bien los numeros (osea no pone 0 en n2) el programa avanza normal
                            {
                            //Crea los objetos numeros despues de obtener los valores
                            Numero numero1 = new Numero(n1);
                            Numero numero2 = new Numero(n2);
                            //Crea el objeto suma
                            Division division= new Division(numero1, numero2);
                            Numero resultado = division.Dividir();

                            vista.escribirSalida(resultado); //imprime el resultado
                            }
                        }break;

                        case 5: //Si el usuario digita 5 es porque quiere salir del programa
                        {
                            vista.salirPrograma(); //Imprime la salida del programa
                        }break;
                            
                        case 6: //Se ejecuta este camino con cualquier numero que no sea 1,2,3,4,5
                        {
                            vista.mostrarDefault(); //Imprime para que el usuario digite un numero valido
                        }break;
                    }
                } 
                catch(java.util.InputMismatchException e)
                {
                    System.out.println("Error: La entrada no es un numero, Por favor, intente de nuevo.");
                    entrada.nextLine();
                    opcion=0;
                }   
            }while (opcion != 5); //El ciclo se repetira hasta que el usuario decida salir del programa
        }entrada.close(); 
    }//Fin del main
}//Fin de la clase App