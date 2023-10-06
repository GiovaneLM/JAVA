package zoo;

public class animal 
{
    private String nome;
    private double comprimento;
    private int numDePatas;
    private String cor;
    private String ambiente;
    private double velocidadeMedia;


    public animal(String nome,double comprimento,int numDePatas,String cor,String ambiente,double velocidadeMedia)
    {
        System.out.println("*****************************************");
        this.nome = nome;
        this.comprimento = comprimento;
        this.numDePatas = numDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;

        System.out.println("Animal cadastrado com sucesso");
    }

    public void dados()
    {
        System.out.println("***************************************");
        System.out.println("nome: " + getnome());
        System.out.println("comprimento: " + getcomprimento() + "cm");
        System.out.println("numDePatas: " + getnemDePatas());
        System.out.println("cor: " + getcor());
        System.out.println("ambiente: " + getambiente());
        System.out.println("velocidadeMedia: " + getvelocidadeMedia());
    }

    public String getnome()
    {
        return nome;
    }
    public void setnome(String nome)
    {
        this.nome = nome;
    }


    public double getcomprimento()
    {
        return comprimento;
    }
    public void setcomprimento(double comprimento)
    {
        this.comprimento = comprimento;
    }

    public int getnemDePatas()
    {
        return numDePatas;
    }
    public void setnumDePatas(int numDePatas)
    {
        this.numDePatas = numDePatas;
    }

    public String getcor()
    {
        return cor;
    }
    public void setcor(String cor)
    {
        this.cor = cor;
    }

    public String getambiente()
    {
        return ambiente;
    }
    public void setambiente(String ambiente)
    {
        this.ambiente = ambiente;
    }

    public double getvelocidadeMedia()
    {
        return velocidadeMedia;
    }
    public void setvelocidadeMedia(double velocidadeMedia)
    {
        this.velocidadeMedia = velocidadeMedia;
    }
}
