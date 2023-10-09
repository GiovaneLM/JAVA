package aula0009;

public class contaEspecial extends contaBancaria
{
    
    private float limite;
    
    public contaEspecial(String cliente,int num_conta,float saldo,float limite)
    {
        super(cliente, num_conta, saldo);
        this.limite = limite;
        System.out.println("tipo conta especial");
    }

    public void dados() 
    {
        super.dados();
        System.out.println("limite: " + getlimite());
        System.out.println("*******************************************************");
    }

    public void sacar(float valor) 
    {
        float saldoTotal = getsaldo() + limite;
        if(saldoTotal<=valor)
        {
            System.out.println("valor maior que o limite de saque .\n limite: R$"+limite);
        }
        else
        {
            if(saldoTotal>=valor)
            {
                if(valor<=getsaldo())
                {
                    super.sacar(valor);
                }
                else{
                    float limiteUtilizado = valor - getsaldo();
                    setsaldo(0);
                    limite -= limite;
                    setsaldo(getsaldo()-limite);
                    System.out.println("Saque de R$" + valor + "realizado com sucesso (utilizando o limite) \n saldo atual: R$" + getsaldo());
                }
            }
        }
    }






            /*METODO ATRIBUTOS */
    public void setlimite(float limite) 
    {
        this.limite = limite;
    }
    public float getlimite() 
    {
        return limite;
    }
}
