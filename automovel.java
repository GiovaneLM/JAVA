package automovel;
public class automovel 
{
    public String marca;
    public String modelo;
    public String cor;
    public int velocidade;


    public void businar()
    {
        System.out.println("BI!BI!");
    }

    public void acelerar()
    {
        velocidade += 1;
    }

    public void reduzir()
    {
        velocidade -= 1;
    }


}
