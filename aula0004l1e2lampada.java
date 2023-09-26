package lampada;

public class aula0004l1e2lampada 
{
    public boolean acesa;
    public int potencia;

    public void acender()
    {
        acesa=true;
    }
    public void apagar()
    {
        acesa=false;
    }
    public void InfoSitu()
    {
        if(acesa == true)
        {
            System.out.println("lampada esta Acesa");
        }
        else
        {
            System.out.println("lampada esta apagada");
        }
    }
    public void InfoPoten() 
        {
            System.out.println("potencia atual ====>" + potencia);
        }
}
