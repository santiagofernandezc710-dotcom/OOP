#include <iostream> //Librería para entrada y salida que usa cin y cout
#include <string>   //Librería para usar string

using namespace std; //Permite usar cout, cin y string sin escribir std::

class Arrays1 //Es la clase llamada Arrays1
{ 
public: //Indica que lo siguiente es accesible desde fuera de la clase

    static const int MAX = 100; //Es una constante que define el tamaño máximo del arreglo
	int n; //Es un entero que guardara la cantidad de elementos que usará el vector
	int data[MAX]; //Es un arreglo de enteros con tamaño fijo MAX de 100 posiciones

    // El constructor de la clase que recibe el tamaño n
    Arrays1(int n) 
	{
		this->n=n; //Guarda en la variable de la clase el valor de n recibido

        //Bucle que inicializa el vector con ceros
        for (int i = 0; i < n; i++)//Recorre desde la posición 0 hasta n-1
		{ 
            data[i] = 0;//Coloca 0 en cada posición del arreglo
        }
    }

    // Función para ingresar valores al vector
    void setVector(const string& name) //name es el nombre que se mostrará del vector
	{ 

        for (int i = 0; i < n; i++) //Recorre todas las posiciones del arreglo
		{ // Recorre todas las posiciones del arreglo

            cout << name << "[" << i << "]: "; //Muestra algo como: myVector[0]:

            cin >> data[i]; //Lee el número que escribe el usuario y lo guarda en data[i]
        }
    }

    //Función que sirve para imprimir el vector
    void getVector(const string& name) const // const indica que no modificará los datos
	{ 

        cout << name << " = [ "; //Imprime [

        for (int i = 0; i < n; i++) //Recorre todas las posiciones del arreglo
		{ 

            cout << data[i]; //Imprime el valor almacenado en data[i]

            if (i < n - 1) //Verifica si no es el último elemento
                cout << " , "; //Imprime una coma entre los valores
        }

        cout << " ]" << endl; // Cierra el vector con ] y hace salto de línea
    }
};

int main() //Función principal donde inicia el programa
{

    int n; //Variable para guardar el tamaño del vector

    cout << "Tamano n (max " << Arrays1::MAX << "): "; // Pide al usuario el tamaño del vector

    cin >> n; //Lee el valor ingresado por el usuario

    //Verifica que el tamaño esté dentro del rango permitido
    if (n < 1 || n > Arrays1::MAX) //Si n es menor que 1 o mayor que 100
	{ 

        cout << "Error: n debe estar entre 1 y " << Arrays1::MAX << ".\n"; //Muestra error

        return 0; //Termina el programa
    }

    Arrays1 v(n); //Crea un objeto v de la clase Arrays1 con tamaño n

    v.setVector("myVector"); //Llama a la función para llenar el vector

    v.getVector("myVector"); //Llama a la función para imprimir el vector

    return 0; //Finaliza el programa 
}