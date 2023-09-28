package banco;

public class ContaCorrenteSor 
{
    public float saldo;
    
    
    // metodos
    public void definirSaldoInicial(float valor)
    {
        saldo = valor;
    }
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
       }else
       {
           return false;
       }
    }
}
