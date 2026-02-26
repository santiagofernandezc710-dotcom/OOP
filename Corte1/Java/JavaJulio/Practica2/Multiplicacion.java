public class Multiplicacion //Creo la clase Multiplicacion
{
    //Campos o Atributos
    private Numero numero1;
    private Numero numero2;

    //Sobrecargas de Constructores
    public Multiplicacion()
    {
    }
    
    public Multiplicacion(Numero numero1, Numero numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodo para multiplicar
    public Numero Multiplicar()
    {
        double resultado = numero1.getNumero() * numero2.getNumero();
        return new Numero(resultado);
    }
}
