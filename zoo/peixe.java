package zoo;

public class peixe extends animal 
{
    private String caracteristica;

    public peixe(String nome,double comprimento,int numDePatas,String cor,String ambiente,double velocidadeMedia,String caracteristica)
    {
        super(nome, comprimento, numDePatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
        System.out.println("tipo peixe");
    }

    public String getcaracteristica()
    {
        return caracteristica;
    }
    public void setcaracteristica(String caracteristica) 
    {
        this.caracteristica = caracteristica;
    }

    public void dados() 
    {
        super.dados();
        System.out.println("caracteristica: " + getcaracteristica());
        System.out.println("*******************************************************");
    }
}
