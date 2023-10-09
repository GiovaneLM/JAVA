package aula0009;

public class contaPoupanca extends contaBancaria
{
    private int rendimento;

    public contaPoupanca(String cliente,int num_conta,float saldo,int rendimento)
    {
        super(cliente,num_conta,saldo);
        this.rendimento = rendimento;
        System.out.println("tipo conta poupança");

    }

    public void dados() 
    {
        super.dados();
        System.out.println("caracteristica: " + getrendimento());
        System.out.println("*******************************************************");
    }

    public void novosaldo() 
    {
        setsaldo(getsaldo() + (getsaldo() * rendimento/100));
        System.out.println("rendimento de " + rendimento + "% acrescentando ao saldo! \n R$ " + getsaldo());
    }


            /*METODO ATRIBUTOS */
    public void setrendimento(int rendimento) 
    {
        this.rendimento = rendimento;
    }
    public int getrendimento() 
    {
        return rendimento;
    }
}
