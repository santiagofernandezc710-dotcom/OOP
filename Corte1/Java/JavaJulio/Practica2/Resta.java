public class Resta //Creo la clase Resta
{
    //Campos o Atributos
    private Numero numero1;
    private Numero numero2;

    //Sobrecargas de Constructores
    public Resta()
    {
    }
    
    public Resta(Numero numero1, Numero numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodo para restar
    public Numero restar()
    {
        double resultado = numero1.getNumero() - numero2.getNumero();
        return new Numero(resultado);
    }
}
