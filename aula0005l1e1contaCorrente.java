package banco;
import java.util.Scanner;
public class contaCorrente 
{

    public int NumCon;
    public float saldo;
    public float valor;
    public boolean menu;

    /*metodos */
    public void depositar(float valor)
    {
        saldo+=valor;
    }
    public boolean sacar(float valor)
    {
        if(valor<=saldo)
        {
            saldo-=valor;
            return true;
        }
        else
        {
            System.out.println("valor invalido");
            return false;
        }
    }
}



