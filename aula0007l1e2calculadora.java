package calculadora;

public class aula0007l1e2calculadora 
{
    private static float valor1;
    private static float valor2;
    private static float div,multi,soma,sub;
    
    
    public void setvalor1(float valor1)
    {
        this.valor1 = valor1;
    }
    public static float getvalor1()
    {
        return valor1;
    }


    public void setvalor2(float valor2)
    {
        this.valor1 = valor1;
    }
    public static float getvalor2()
    {
        return valor2;
    }


    public void setdiv(float valor1,float valor2)
    {
        div = valor1 / valor2;
    }
    public static float getdiv() 
    {
        return div;
    }


    public void setmulti(float valor1,float valor2)
    {
        multi = valor1 * valor2;
    }
    public static float getmulti() 
    {
        return multi;
    }


    public void setsoma(float valor1,float valor2)
    {
        soma = valor1 + valor2;
    }
    public static float getsoma() 
    {
        return soma;
    }

    
    public void setsub(float valor1,float valor2)
    {
        sub = valor1 - valor2;
    }
    public static float getsub() 
    {
        return sub;
    }

    
}
