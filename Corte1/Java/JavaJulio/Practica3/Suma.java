public class Suma //Creo la clase Suma
{
    //Campos o Atributos
    private Numero numero1;
    private Numero numero2;

    //Sobrecargas de Constructores
    public Suma()
    {
    }
    
    public Suma(Numero numero1, Numero numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodo para sumar
    public Numero sumar()
    {
        double resultado = numero1.getNumero() + numero2.getNumero();
        return new Numero(resultado);
    }
}
