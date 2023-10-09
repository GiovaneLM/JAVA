package aula0009;

public class contaBancaria 
{
    private String cliente;
    private int num_conta;
    private float saldo;
    private float valor;

    public contaBancaria(String cliente,int num_conta,float saldo)
    {
        System.out.println("*************************************");
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;

        System.out.println("conta criada");
    }

    public void dados() 
    {
        System.out.println("cliente: " + cliente);
        System.out.println("num_conta: " + num_conta);
        System.out.println("saldo: " + saldo);
    }


    public void sacar(float valor) 
    {
        if((saldo>=valor)&&(saldo>0))
        {
            saldo = saldo - valor;
            System.out.println("saque realizado");

        }
        else
        {
            System.out.println("saldo insuficiente");
        }
    }

    public void depositar(float valor) 
    {
        if(valor> 0)
        {
            saldo = saldo + valor;
            System.out.println("deposito realizado");

        }
        else
        {
            System.out.println("valor de deposito invalido");
        }
    }

                /*METODOS ATRIBUTOS */
    public void setcleinte(String cleinte) 
    {
        this.cliente = cliente;
    }
    public String getcliente() 
    {
        return cliente;
    }

    public void setnum_conta(int num_conta) 
    {
        this.num_conta = num_conta;
    }
    public int getnum_conta() 
    {
        return num_conta;
    }

    public void setsaldo(float saldo) 
    {
        this.saldo = saldo;
    }
    public float getsaldo() 
    {
        return saldo;
    }
}
