package zoo;

public class mamifero extends animal 
{
    private String alimento;

    public mamifero(String nome,double comprimento,int numDePatas,String cor,String ambiente,double velocidadeMedia,String alimento)
    {
        super(nome, comprimento, numDePatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
        System.out.println("tipo mamifero");
    }

    public String getalimento() 
    {
        return alimento;
    }
    private void setalimento(String alimento) 
    {
        this.alimento = alimento;
    }

    public void dado() 
    {
        super.dados();
        System.out.println("alimento: " + getalimento());
        System.out.println("****************************************************************");
    }
}
